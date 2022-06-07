package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TablesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech2, btnMKT2, btnElectrodyn2,btnMagn2, btnOptica2, btnQuantum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation2);


        bottomNavigationView.setSelectedItemId(R.id.tables);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.practice:
                        startActivity(new Intent(getApplicationContext(), PracticeActivity.class));
                        overridePendingTransition(0, 0);

                    case R.id.topics:
                        startActivity(new Intent(getApplicationContext(), TopicsActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.tables:
                        return true;
                }
                return  false;
            }
        });


        btnMech2 = (ImageButton) findViewById(R.id.btnMech);
        btnMKT2 = (ImageButton) findViewById(R.id.btnMKT);
        btnElectrodyn2 = (ImageButton) findViewById(R.id.btnElectrodyn);
        btnMagn2 = (ImageButton) findViewById(R.id.btnMagn);
        btnOptica2 = (ImageButton) findViewById(R.id.btnOptica);
        btnQuantum2 = (ImageButton) findViewById(R.id.btnQuantum);

        btnMech2.setOnClickListener(this);
        btnMKT2.setOnClickListener(this);
        btnElectrodyn2.setOnClickListener(this);
        btnMagn2.setOnClickListener(this);
        btnOptica2.setOnClickListener(this);
        btnQuantum2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnMech:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}