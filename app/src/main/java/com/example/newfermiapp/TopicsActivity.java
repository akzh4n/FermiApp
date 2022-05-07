package com.example.newfermiapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TopicsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnMech, btnMKT, btnElectrodyn, btnMagn, btnOptica, btnQuantum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);


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
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnMKT:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnElectrodyn:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnMagn:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnOptica:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch(v.getId()) {
            case R.id.btnQuantum:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }


    }
}