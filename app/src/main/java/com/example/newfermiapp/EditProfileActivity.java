package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EditProfileActivity extends AppCompatActivity {


     Button btnSave;
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

         TextUsername = (EditText) findViewById(R.id.EditTextUsername);
         TextEmail = (EditText) findViewById(R.id.EditTextEmail);
         TextPassword = (EditText) findViewById(R.id.EditTextPassword);


         showAllUserData();


         btnSave = (Button) findViewById(R.id.btnSave);
         btnSave.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                updateUserData(view);
                Intent intent = new Intent(EditProfileActivity.this, UserProfileActivity.class);
                startActivity(intent);
             }
         });
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
