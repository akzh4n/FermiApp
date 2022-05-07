package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PracticeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech1, btnMKT1, btnElectrodyn1,btnMagn1, btnOptica1, btnQuantum1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);


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
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT1:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn1:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn1:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica1:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum1:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}