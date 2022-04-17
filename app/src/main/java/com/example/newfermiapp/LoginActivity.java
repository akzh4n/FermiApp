package com.example.newfermiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText username, password;
    Button btnlogin;
    DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnlogin = (Button) findViewById(R.id.btnLogin1);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin.setOnClickListener(this);

        DB = new DBHelper(this);
    }


            @Override
            public void onClick(View v) {

                switch(v.getId()) {
                    case R.id.btnLogin:
                        Intent intent = new Intent(this, HomeActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this,"Пожалуйста заполните все поля", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                    if(checkuserpass == true) {
                        Toast.makeText(LoginActivity.this,"Успешный вход",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(LoginActivity.this,"Недействительные данные", Toast.LENGTH_SHORT).show();

                    }
                }
            }



    }

