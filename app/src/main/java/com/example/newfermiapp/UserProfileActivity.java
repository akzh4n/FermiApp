package com.example.newfermiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfileActivity  extends AppCompatActivity {


    Button btnEdit, btnLogout;

    public TextView TextUsername;
    public TextView TextEmail;
    public FirebaseAuth mAuth;
    public FirebaseUser user;
    public DatabaseReference reference;
    public String userID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);


        mAuth = FirebaseAuth.getInstance();
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        TextUsername = (TextView) findViewById(R.id.EditTextUsername);
        TextEmail = (TextView) findViewById(R.id.EditTextEmail);


        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if(signInAccount != null) {
            TextUsername.setText(signInAccount.getDisplayName());
            TextEmail.setText(signInAccount.getEmail());
        }


        showAllUserData();


        btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(UserProfileActivity.this, MainActivity.class));
        } );

        btnEdit = (Button) findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserProfileActivity.this, EditProfileActivity.class);
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
                    String username = userProfile.username;
                    String email = userProfile.email;

                    TextUsername.setText(username);
                    TextEmail.setText(email);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(UserProfileActivity.this, "WTH", Toast.LENGTH_SHORT).show();
            }
        });

    }






}