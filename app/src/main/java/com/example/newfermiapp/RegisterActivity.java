package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText username, emailfield, password, repassword;
    Button btnRegister, btnLogin;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.username);
        emailfield = (EditText) findViewById(R.id.emailfield) ;
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);


        DB = new DBHelper(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btnLogin:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }





                String user = username.getText().toString();
                String email = emailfield.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();



                if (user.equals("") || email.equals("") || pass.equals("") || repass.equals(""))
                    Toast.makeText(RegisterActivity.this, "Пожалуйста заполните все поля", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)) {
                        Boolean checkuser = DB.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = DB.insertData(user,email, pass);
                            if (insert == true) {
                                Toast.makeText(RegisterActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(RegisterActivity.this, "Ошибка регистраций", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(RegisterActivity.this, "Пользователь уже существует, пожалуйста зарегистрируйтесь", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegisterActivity.this, "Пароли не совпадают", Toast.LENGTH_SHORT).show();
                    }
                }
            }





    }
