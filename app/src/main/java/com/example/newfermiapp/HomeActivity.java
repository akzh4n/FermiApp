package com.example.newfermiapp;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSettings, btnAboutUs, btnStart;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnSettings = (Button) findViewById(R.id.btnSettings);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnSettings.setOnClickListener(this);
        btnAboutUs.setOnClickListener(this);
        btnStart.setOnClickListener(this);


        mAuth = FirebaseAuth.getInstance();



    }

            @Override
            public void onClick(View v) {

            switch (v.getId()) {
            case R.id.btnSettings:
                Intent intent = new Intent(this, UserProfileActivity.class);
                startActivity(intent);
                break;
            default:
                break;

             }


             switch(v.getId()) {
                case R.id.btnAboutUs:
                        Intent intent = new Intent(this, AboutUsActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }


                switch(v.getId()) {
                    case R.id.btnStart:
                        Intent intent = new Intent(this, StartActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }



    }
}