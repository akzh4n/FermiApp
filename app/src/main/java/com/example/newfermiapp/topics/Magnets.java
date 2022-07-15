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
import com.example.newfermiapp.infomaterials.electricity.elact2;
import com.example.newfermiapp.infomaterials.electricity.elact3;
import com.example.newfermiapp.infomaterials.electricity.elact4;
import com.example.newfermiapp.infomaterials.electricity.elact5;
import com.example.newfermiapp.infomaterials.electricity.elact6;
import com.example.newfermiapp.infomaterials.electricity.elact7;
import com.example.newfermiapp.infomaterials.electricity.elact8;
import com.example.newfermiapp.infomaterials.electricity.elact9;
import com.example.newfermiapp.infomaterials.magnets.magact1;
import com.example.newfermiapp.infomaterials.magnets.magact10;
import com.example.newfermiapp.infomaterials.magnets.magact11;
import com.example.newfermiapp.infomaterials.magnets.magact12;
import com.example.newfermiapp.infomaterials.magnets.magact13;
import com.example.newfermiapp.infomaterials.magnets.magact14;
import com.example.newfermiapp.infomaterials.magnets.magact2;
import com.example.newfermiapp.infomaterials.magnets.magact3;
import com.example.newfermiapp.infomaterials.magnets.magact4;
import com.example.newfermiapp.infomaterials.magnets.magact5;
import com.example.newfermiapp.infomaterials.magnets.magact6;
import com.example.newfermiapp.infomaterials.magnets.magact7;
import com.example.newfermiapp.infomaterials.magnets.magact8;
import com.example.newfermiapp.infomaterials.magnets.magact9;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Magnets extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magnets);

        card1 = (CardView) findViewById(R.id.magcard1);
        card2 = (CardView) findViewById(R.id.magcard2);
        card3 = (CardView) findViewById(R.id.magcard3);
        card4 = (CardView) findViewById(R.id.magcard4);
        card5 = (CardView) findViewById(R.id.magcard5);
        card6 = (CardView) findViewById(R.id.magcard6);
        card7 = (CardView) findViewById(R.id.magcard7);
        card8 = (CardView) findViewById(R.id.magcard8);
        card9 = (CardView) findViewById(R.id.magcard9);
        card10 = (CardView) findViewById(R.id.magcard10);
        card11 = (CardView) findViewById(R.id.magcard11);
        card12 = (CardView) findViewById(R.id.magcard12);
        card13 = (CardView) findViewById(R.id.magcard13);
        card14 = (CardView) findViewById(R.id.magcard14);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact5.class));
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact6.class));
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact7.class));
            }
        });



        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact8.class));
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),  magact9.class));
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact10.class));
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact11.class));
            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact12.class));
            }
        });

        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact13.class));
            }
        });

        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), magact14.class));
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