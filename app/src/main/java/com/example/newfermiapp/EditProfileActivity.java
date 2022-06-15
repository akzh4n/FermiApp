package com.example.newfermiapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.squareup.picasso.Picasso;
import com.theartofdev.edmodo.cropper.CropImage;

import org.w3c.dom.Text;

import java.io.StringBufferInputStream;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfileActivity extends AppCompatActivity {

    private CircleImageView profileImageView;
    private Uri imageUri;
    private String myUri = "";
    private StorageTask uploadTask;
    private StorageReference storageProfilePicsRef;
    Button btnSave;
    TextView changeProfileBtn;
    public DatabaseReference reference;
    public FirebaseAuth mAuth;
    EditText TextUsername, TextEmail, TextPassword;
    String username, email, password;
    public FirebaseUser user;
    public String userID;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_editprofile);

         mAuth = FirebaseAuth.getInstance();
         user = FirebaseAuth.getInstance().getCurrentUser();
         reference = FirebaseDatabase.getInstance().getReference().child("Users");
         userID = user.getUid();
         storageProfilePicsRef = FirebaseStorage.getInstance().getReference().child("Profile Pics");
         profileImageView = (CircleImageView) findViewById(R.id.profile_image);
         changeProfileBtn = (TextView) findViewById(R.id.change_profile_btn);



         TextUsername = (EditText) findViewById(R.id.EditTextUsername);
         TextEmail = (EditText) findViewById(R.id.EditTextEmail);
         TextPassword = (EditText) findViewById(R.id.EditTextPassword);


         showAllUserData();


         btnSave = (Button) findViewById(R.id.btnSave);
         btnSave.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                updateUserData(view);
                uploadProfileImage(view);
                Intent intent = new Intent(EditProfileActivity.this, UserProfileActivity.class);
                startActivity(intent);
             }
         });


         changeProfileBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 CropImage.activity().setAspectRatio(1,1).start(EditProfileActivity.this);

             }
         });

         getUserInfo();
     }

     private void getUserInfo() {
         reference.child(mAuth.getCurrentUser().getUid()).addValueEventListener(new ValueEventListener() {
             @Override
             public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                 if(dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0){
                     if(dataSnapshot.hasChild("image"))
                     {
                       String image = dataSnapshot.child("image").getValue().toString();
                         Picasso.get().load(image).into(profileImageView);
                     }
                 }
             }

             @Override
             public void onCancelled(@NonNull DatabaseError error) {

             }
         });
     }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE && requestCode == RESULT_OK && data != null)
        {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            imageUri = result.getUri();

            profileImageView.setImageURI(imageUri);
        }
        else {
            Toast.makeText(this, "Ошибка, попробуйте еще раз!", Toast.LENGTH_SHORT).show();

        }
    }

    private void uploadProfileImage(View view) {

         final ProgressDialog progressDialog = new ProgressDialog(this);
         progressDialog.setTitle("Обновление профиля");
         progressDialog.setMessage("Пожалуйтса подождите, мы обновляем ваши данные");
         progressDialog.show();

         if(imageUri != null)
         {
             final StorageReference fileRef = storageProfilePicsRef.child(mAuth.getCurrentUser().getUid() + ".jpg");

             uploadTask = fileRef.putFile(imageUri);

             uploadTask.continueWithTask(new Continuation() {
                 @Override
                 public Object then(@NonNull Task task) throws Exception {
                     if(!task.isSuccessful())
                     {
                         throw task.getException();
                     }
                     return fileRef.getDownloadUrl();
                 }
             }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                 @Override
                 public void onComplete(@NonNull Task<Uri> task) {
                     if(task.isSuccessful())
                     {
                         Uri downloadUri = task.getResult();
                         myUri = downloadUri.toString();

                         HashMap<String, Object> userMap = new HashMap<>();
                         userMap.put("image", myUri);

                         reference.child(mAuth.getCurrentUser().getUid()).updateChildren(userMap);


                         progressDialog.dismiss();

                     }
                 }
             });
         }
         else {
             progressDialog.dismiss();
             Toast.makeText(this, "Изображение не выбрано", Toast.LENGTH_SHORT).show();
         }
    }

    public void showAllUserData() {
        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if (userProfile != null) {
                    username = userProfile.username;
                    email = userProfile.email;
                    password = userProfile.password;

                    TextUsername.setText(username);
                    TextEmail.setText(email);
                    TextPassword.setText(password);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(EditProfileActivity.this, "WTH", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void updateUserData(View view) {
        if(isNameChanged() || isEmailChanged() || isPasswordChanged() ) {
            Toast.makeText(EditProfileActivity.this, "Ваш профиль полностью изменен!", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isPasswordChanged() {
        if(!password.equals(TextPassword.getText().toString()) && !TextPassword.getText().toString().isEmpty()) {
            reference.child(userID).child("password").setValue(TextPassword.getText().toString());
            return true;
        }
        else {
            Toast.makeText(EditProfileActivity.this, "Не все поля заполнены!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean isEmailChanged() {
        if(!email.equals(TextEmail.getText().toString()) && !TextEmail.getText().toString().isEmpty()) {
            reference.child(userID).child("email").setValue(TextEmail.getText().toString());
            return true;
        }
        else {
            Toast.makeText(EditProfileActivity.this, "Не все поля заполнены!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean isNameChanged() {
        if(!username.equals(TextUsername.getText().toString()) && !TextUsername.getText().toString().isEmpty()) {
            reference.child(userID).child("username").setValue(TextUsername.getText().toString());
            return true;
        }
        else {
            Toast.makeText(EditProfileActivity.this, "Не все поля заполнены!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }




}
