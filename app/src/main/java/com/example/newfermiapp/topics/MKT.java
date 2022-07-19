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
import com.example.newfermiapp.infomaterials.mkt.mktact1;
import com.example.newfermiapp.infomaterials.mkt.mktact10;
import com.example.newfermiapp.infomaterials.mkt.mktact11;
import com.example.newfermiapp.infomaterials.mkt.mktact12;
import com.example.newfermiapp.infomaterials.mkt.mktact13;
import com.example.newfermiapp.infomaterials.mkt.mktact14;
import com.example.newfermiapp.infomaterials.mkt.mktact15;
import com.example.newfermiapp.infomaterials.mkt.mktact16;
import com.example.newfermiapp.infomaterials.mkt.mktact17;
import com.example.newfermiapp.infomaterials.mkt.mktact2;
import com.example.newfermiapp.infomaterials.mkt.mktact3;
import com.example.newfermiapp.infomaterials.mkt.mktact4;
import com.example.newfermiapp.infomaterials.mkt.mktact5;
import com.example.newfermiapp.infomaterials.mkt.mktact6;
import com.example.newfermiapp.infomaterials.mkt.mktact7;
import com.example.newfermiapp.infomaterials.mkt.mktact8;
import com.example.newfermiapp.infomaterials.mkt.mktact9;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MKT extends AppCompatActivity {
    private CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkt);

        card1 = (CardView) findViewById(R.id.mktcard1);
        card2 = (CardView) findViewById(R.id.mktcard2);
        card3 = (CardView) findViewById(R.id.mktcard3);
        card4 = (CardView) findViewById(R.id.mktcard4);
        card5 = (CardView) findViewById(R.id.mktcard5);
        card6 = (CardView) findViewById(R.id.mktcard6);
        card7 = (CardView) findViewById(R.id.mktcard7);
        card8 = (CardView) findViewById(R.id.mktcard8);
        card9 = (CardView) findViewById(R.id.mktcard9);
        card10 = (CardView) findViewById(R.id.mktcard10);
        card11 = (CardView) findViewById(R.id.mktcard11);
        card12 = (CardView) findViewById(R.id.mktcard12);
        card13 = (CardView) findViewById(R.id.mktcard13);
        card14 = (CardView) findViewById(R.id.mktcard14);
        card15 = (CardView) findViewById(R.id.mktcard15);
        card16 = (CardView) findViewById(R.id.mktcard16);
        card17 = (CardView) findViewById(R.id.mktcard17);




        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact5.class));
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact6.class));
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact7.class));
            }
        });



        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact8.class));
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),  mktact9.class));
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact10.class));
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact11.class));
            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact12.class));
            }
        });

        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact13.class));
            }
        });

        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact14.class));
            }
        });

        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact15.class));
            }
        });

        card16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact16.class));
            }
        });

        card17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), mktact17.class));
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