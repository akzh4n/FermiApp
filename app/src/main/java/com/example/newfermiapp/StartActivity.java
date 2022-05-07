package com.example.newfermiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTopics, btnPractice, btnTables;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        btnTopics = (Button) findViewById(R.id.btnTopics);
        btnPractice = (Button) findViewById(R.id.btnPractice);
        btnTables = (Button) findViewById(R.id.btnTables);
        btnTopics.setOnClickListener(this);
        btnPractice.setOnClickListener(this);
        btnTables.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnTopics:
                Intent intent = new Intent(this, TopicsActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }


        switch(v.getId()) {
            case R.id.btnPractice:
                Intent intent = new Intent(this, PracticeActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        switch(v.getId()) {
            case R.id.btnTables:
                Intent intent = new Intent(this, TablesActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }



    }
}