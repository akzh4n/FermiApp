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
import com.example.newfermiapp.infomaterials.electricity.elact1;
import com.example.newfermiapp.infomaterials.electricity.elact10;
import com.example.newfermiapp.infomaterials.electricity.elact11;
import com.example.newfermiapp.infomaterials.electricity.elact12;
import com.example.newfermiapp.infomaterials.electricity.elact13;
import com.example.newfermiapp.infomaterials.electricity.elact14;
import com.example.newfermiapp.infomaterials.electricity.elact15;
import com.example.newfermiapp.infomaterials.electricity.elact16;
import com.example.newfermiapp.infomaterials.electricity.elact2;
import com.example.newfermiapp.infomaterials.electricity.elact3;
import com.example.newfermiapp.infomaterials.electricity.elact4;
import com.example.newfermiapp.infomaterials.electricity.elact5;
import com.example.newfermiapp.infomaterials.electricity.elact6;
import com.example.newfermiapp.infomaterials.electricity.elact7;
import com.example.newfermiapp.infomaterials.electricity.elact8;
import com.example.newfermiapp.infomaterials.electricity.elact9;
import com.example.newfermiapp.infomaterials.quantum.quantact1;
import com.example.newfermiapp.infomaterials.quantum.quantact2;
import com.example.newfermiapp.infomaterials.quantum.quantact3;
import com.example.newfermiapp.infomaterials.quantum.quantact4;
import com.example.newfermiapp.infomaterials.quantum.quantact5;
import com.example.newfermiapp.infomaterials.quantum.quantact6;
import com.example.newfermiapp.infomaterials.quantum.quantact7;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Electricity extends AppCompatActivity {
    private CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        card1 = (CardView) findViewById(R.id.elcard1);
        card2 = (CardView) findViewById(R.id.elcard2);
        card3 = (CardView) findViewById(R.id.elcard3);
        card4 = (CardView) findViewById(R.id.elcard4);
        card5 = (CardView) findViewById(R.id.elcard5);
        card6 = (CardView) findViewById(R.id.elcard6);
        card7 = (CardView) findViewById(R.id.elcard7);
        card8 = (CardView) findViewById(R.id.elcard8);
        card9 = (CardView) findViewById(R.id.elcard9);
        card10 = (CardView) findViewById(R.id.elcard10);
        card11 = (CardView) findViewById(R.id.elcard11);
        card12 = (CardView) findViewById(R.id.elcard12);
        card13 = (CardView) findViewById(R.id.elcard13);
        card14 = (CardView) findViewById(R.id.elcard14);
        card15 = (CardView) findViewById(R.id.elcard15);
        card16 = (CardView) findViewById(R.id.elcard16);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact5.class));
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact6.class));
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact7.class));
            }
        });



        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact8.class));
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),  elact9.class));
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact10.class));
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact11.class));
            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact12.class));
            }
        });

        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact13.class));
            }
        });

        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact14.class));
            }
        });

        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact15.class));
            }
        });

        card16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), elact16.class));
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