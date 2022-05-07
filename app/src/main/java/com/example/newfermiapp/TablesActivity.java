package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TablesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech2, btnMKT2, btnElectrodyn2,btnMagn2, btnOptica2, btnQuantum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);


        btnMech2 = (ImageButton) findViewById(R.id.btnMech2);
        btnMKT2 = (ImageButton) findViewById(R.id.btnMKT2);
        btnElectrodyn2 = (ImageButton) findViewById(R.id.btnElectrodyn2);
        btnMagn2 = (ImageButton) findViewById(R.id.btnMagn2);
        btnOptica2 = (ImageButton) findViewById(R.id.btnOptica2);
        btnQuantum2 = (ImageButton) findViewById(R.id.btnQuantum2);

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
            case R.id.btnMech2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum2:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}