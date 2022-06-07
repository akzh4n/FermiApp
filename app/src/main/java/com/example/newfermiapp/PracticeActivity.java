package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
            case R.id.btnMech:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}