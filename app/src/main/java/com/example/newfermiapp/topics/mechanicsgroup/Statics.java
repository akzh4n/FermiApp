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
import com.example.newfermiapp.infomaterials.statics.statact1;
import com.example.newfermiapp.infomaterials.statics.statact2;
import com.example.newfermiapp.infomaterials.statics.statact3;
import com.example.newfermiapp.infomaterials.statics.statact4;
import com.example.newfermiapp.infomaterials.statics.statact5;
import com.example.newfermiapp.infomaterials.statics.statact6;
import com.example.newfermiapp.infomaterials.statics.statact7;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Statics extends AppCompatActivity {
    private CardView card1, card2, card3, card4, card5, card6, card7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statics);



        card1 = (CardView) findViewById(R.id.statcard1);
        card2 = (CardView) findViewById(R.id.statcard2);
        card3 = (CardView) findViewById(R.id.statcard3);
        card4 = (CardView) findViewById(R.id.statcard4);
        card5 = (CardView) findViewById(R.id.statcard5);
        card6 = (CardView) findViewById(R.id.statcard6);
        card7 = (CardView) findViewById(R.id.statcard7);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact5.class));
            }
        });


        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact6.class));
            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), statact7.class));
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation3);


        bottomNavigationView.setSelectedItemId(R.id.statics);

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