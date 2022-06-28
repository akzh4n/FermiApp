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
import com.example.newfermiapp.infomaterials.kinematics.kinemact1;
import com.example.newfermiapp.infomaterials.kinematics.kinemact2;
import com.example.newfermiapp.infomaterials.kinematics.kinemact3;
import com.example.newfermiapp.infomaterials.kinematics.kinemact4;
import com.example.newfermiapp.infomaterials.kinematics.kinemact5;
import com.example.newfermiapp.infomaterials.kinematics.kinemact6;
import com.example.newfermiapp.infomaterials.kinematics.kinemact7;
import com.example.newfermiapp.infomaterials.kinematics.kinemact8;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Kinematics extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6, card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinematics);


        card1 = (CardView) findViewById(R.id.kinemcard1);
        card2 = (CardView) findViewById(R.id.kinemcard2);
        card3 = (CardView) findViewById(R.id.kinemcard3);
        card4 = (CardView) findViewById(R.id.kinemcard4);
        card5 = (CardView) findViewById(R.id.kinemcard5);
        card6 = (CardView) findViewById(R.id.kinemcard6);
        card7 = (CardView) findViewById(R.id.kinemcard7);
        card8 = (CardView) findViewById(R.id.kinemcard8);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),kinemact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact5.class));
            }
        });


        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact6.class));
            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact7.class));
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), kinemact8.class));
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation3);


        bottomNavigationView.setSelectedItemId(R.id.kinematics);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.backbutton:
                        startActivity(new Intent(getApplicationContext(), TopicsActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.kinematics:
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
                        startActivity(new Intent(getApplicationContext(), WE.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return  false;
            }
        });
    }
}