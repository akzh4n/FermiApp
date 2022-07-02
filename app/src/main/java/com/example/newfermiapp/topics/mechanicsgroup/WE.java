package com.example.newfermiapp.topics.mechanicsgroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.newfermiapp.R;
import com.example.newfermiapp.TopicsActivity;
import com.example.newfermiapp.infomaterials.we.weact1;
import com.example.newfermiapp.infomaterials.we.weact2;
import com.example.newfermiapp.infomaterials.we.weact3;
import com.example.newfermiapp.infomaterials.we.weact4;
import com.example.newfermiapp.infomaterials.we.weact5;
import com.example.newfermiapp.infomaterials.we.weact6;
import com.example.newfermiapp.infomaterials.we.weact7;
import com.example.newfermiapp.infomaterials.we.weact8;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WE extends AppCompatActivity {


    private CardView card1, card2, card3, card4, card5, card6, card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation3);
        card1 = (CardView) findViewById(R.id.wecard1) ;
        card2 = (CardView)  findViewById(R.id.wecard2);
        card3 = (CardView) findViewById(R.id.wecard3) ;
        card4 = (CardView)  findViewById(R.id.wecard4);
        card5 = (CardView) findViewById(R.id.wecard5) ;
        card6 = (CardView)  findViewById(R.id.wecard6);
        card7 = (CardView) findViewById(R.id.wecard7) ;
        card8 = (CardView)  findViewById(R.id.wecard8);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact1.class));
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact2.class));
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact3.class));
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact4.class));
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact5.class));
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact6.class));
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact7.class));
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact8.class));
            }
        });


        bottomNavigationView.setSelectedItemId(R.id.energy);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.backbutton:
                        startActivity(new Intent(getApplicationContext(), TopicsActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.kinematics:
                        startActivity(new Intent(getApplicationContext(), Kinematics.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.dynamics:
                        startActivity(new Intent(getApplicationContext(), Dynamics.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.statics:
                        startActivity(new Intent(getApplicationContext(), Statics.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.energy:
                        return true;
                }
                return  false;
            }
        });
    }
}