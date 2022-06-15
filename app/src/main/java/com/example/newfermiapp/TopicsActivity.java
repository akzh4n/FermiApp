package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.newfermiapp.topics.mechanicsgroup.Kinematics;
import com.example.newfermiapp.topics.Electricity;
import com.example.newfermiapp.topics.MKT;
import com.example.newfermiapp.topics.Magnets;
import com.example.newfermiapp.topics.Optica;
import com.example.newfermiapp.topics.Quantum;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TopicsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech, btnMKT, btnElectrodyn, btnMagn, btnOptica, btnQuantum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation2);


        bottomNavigationView.setSelectedItemId(R.id.topics);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.practice:
                        startActivity(new Intent(getApplicationContext(), PracticeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.topics:
                        return true;

                    case R.id.tables:
                        startActivity(new Intent(getApplicationContext(), TablesActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return  false;
            }
        });



        btnMech = (ImageButton)findViewById(R.id.btnMech);
         btnMKT = (ImageButton)findViewById(R.id.btnMKT);
         btnElectrodyn = (ImageButton)findViewById(R.id.btnElectrodyn);
         btnMagn = (ImageButton)findViewById(R.id.btnMagn);
         btnOptica = (ImageButton)findViewById(R.id.btnOptica);
         btnQuantum = (ImageButton)findViewById(R.id.btnQuantum);


        btnMech.setOnClickListener(this);
        btnMKT.setOnClickListener(this);
        btnElectrodyn.setOnClickListener(this);
        btnMagn.setOnClickListener(this);
        btnOptica.setOnClickListener(this);
        btnQuantum.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnMech:
                Intent intent = new Intent(this, Kinematics.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT:
                Intent intent = new Intent(this, MKT.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn:
                Intent intent = new Intent(this, Electricity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn:
                Intent intent = new Intent(this, Magnets.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica:
                Intent intent = new Intent(this, Optica.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum:
                Intent intent = new Intent(this, Quantum.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}