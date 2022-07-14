package com.example.newfermiapp.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.newfermiapp.R;
import com.example.newfermiapp.TopicsActivity;
import com.example.newfermiapp.infomaterials.optica.optact1;
import com.example.newfermiapp.infomaterials.optica.optact2;
import com.example.newfermiapp.infomaterials.optica.optact3;
import com.example.newfermiapp.infomaterials.optica.optact4;
import com.example.newfermiapp.infomaterials.optica.optact5;
import com.example.newfermiapp.infomaterials.quantum.quantact1;
import com.example.newfermiapp.infomaterials.quantum.quantact2;
import com.example.newfermiapp.infomaterials.quantum.quantact3;
import com.example.newfermiapp.infomaterials.quantum.quantact4;
import com.example.newfermiapp.infomaterials.quantum.quantact5;
import com.example.newfermiapp.infomaterials.quantum.quantact6;
import com.example.newfermiapp.infomaterials.quantum.quantact7;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Quantum extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6, card7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantum);

        card1 = (CardView) findViewById(R.id.quancard1);
        card2 = (CardView) findViewById(R.id.quancard2);
        card3 = (CardView) findViewById(R.id.quancard3);
        card4 = (CardView) findViewById(R.id.quancard4);
        card5 = (CardView) findViewById(R.id.quancard5);
        card6 = (CardView) findViewById(R.id.quancard6);
        card7 = (CardView) findViewById(R.id.quancard7);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact5.class));
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact6.class));
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), quantact7.class));
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation4);


        bottomNavigationView.setSelectedItemId(R.id.backbutton2);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.backbutton2:
                        startActivity(new Intent(getApplicationContext(), TopicsActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return  false;
            }
        });
    }
}