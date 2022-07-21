package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newfermiapp.quizespractice.QuizElectroActivity;
import com.example.newfermiapp.quizespractice.QuizMKTActivity;
import com.example.newfermiapp.quizespractice.QuizMagnActivity;
import com.example.newfermiapp.quizespractice.QuizMechActivity;
import com.example.newfermiapp.quizespractice.QuizOptActivity;
import com.example.newfermiapp.quizespractice.QuizQuantActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PracticeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech1, btnMKT1, btnElectrodyn1,btnMagn1, btnOptica1, btnQuantum1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation2);


        bottomNavigationView.setSelectedItemId(R.id.practice);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.practice:
                        return true;

                    case R.id.topics:
                        startActivity(new Intent(getApplicationContext(), TopicsActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.tables:
                        startActivity(new Intent(getApplicationContext(), TablesActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return  false;
            }
        });


        btnMech1 = (ImageButton) findViewById(R.id.btnMech1);
        btnMKT1 = (ImageButton) findViewById(R.id.btnMKT1);
        btnElectrodyn1 = (ImageButton) findViewById(R.id.btnElectrodyn1);
        btnMagn1 = (ImageButton) findViewById(R.id.btnMagn1);
        btnOptica1 = (ImageButton) findViewById(R.id.btnOptica1);
        btnQuantum1 = (ImageButton) findViewById(R.id.btnQuantum1);

        btnMech1.setOnClickListener(this);
        btnMKT1.setOnClickListener(this);
        btnElectrodyn1.setOnClickListener(this);
        btnMagn1.setOnClickListener(this);
        btnOptica1.setOnClickListener(this);
        btnQuantum1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnMech1:
                Intent intent = new Intent(this, QuizMechActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT1:
                Intent intent = new Intent(this, QuizMKTActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn1:
                Intent intent = new Intent(this, QuizElectroActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn1:
                Intent intent = new Intent(this, QuizMagnActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica1:
                Intent intent = new Intent(this, QuizOptActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum1:
                Intent intent = new Intent(this, QuizQuantActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}