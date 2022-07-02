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
import com.example.newfermiapp.infomaterials.dynamics.dynamic1;
import com.example.newfermiapp.infomaterials.dynamics.dynamic2;
import com.example.newfermiapp.infomaterials.dynamics.dynamic3;
import com.example.newfermiapp.infomaterials.dynamics.dynamic4;
import com.example.newfermiapp.infomaterials.dynamics.dynamic5;
import com.example.newfermiapp.infomaterials.dynamics.dynamic6;
import com.example.newfermiapp.infomaterials.dynamics.dynamic7;
import com.example.newfermiapp.infomaterials.dynamics.dynamic8;
import com.example.newfermiapp.infomaterials.kinematics.kinemact1;
import com.example.newfermiapp.infomaterials.kinematics.kinemact2;
import com.example.newfermiapp.infomaterials.kinematics.kinemact3;
import com.example.newfermiapp.infomaterials.kinematics.kinemact4;
import com.example.newfermiapp.infomaterials.kinematics.kinemact5;
import com.example.newfermiapp.infomaterials.kinematics.kinemact6;
import com.example.newfermiapp.infomaterials.kinematics.kinemact7;
import com.example.newfermiapp.infomaterials.kinematics.kinemact8;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dynamics extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6, card7, card8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamics);

        card1 = (CardView) findViewById(R.id.dycard1);
        card2 = (CardView) findViewById(R.id.dycard2);
        card3 = (CardView) findViewById(R.id.dycard3);
        card4 = (CardView) findViewById(R.id.dycard4);
        card5 = (CardView) findViewById(R.id.dycard5);
        card6 = (CardView) findViewById(R.id.dycard6);
        card7 = (CardView) findViewById(R.id.dycard7);
        card8 = (CardView) findViewById(R.id.dycard8);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic5.class));
            }
        });


        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic6.class));
            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic7.class));
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), dynamic8.class));
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation3);


        bottomNavigationView.setSelectedItemId(R.id.dynamics);

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