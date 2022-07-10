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
import com.example.newfermiapp.infomaterials.statics.statact1;
import com.example.newfermiapp.infomaterials.statics.statact2;
import com.example.newfermiapp.infomaterials.statics.statact3;
import com.example.newfermiapp.infomaterials.statics.statact4;
import com.example.newfermiapp.infomaterials.statics.statact5;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Optica extends AppCompatActivity {

    private CardView card1, card2, card3, card4, card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optica);

        card1 = (CardView) findViewById(R.id.opcard1);
        card2 = (CardView) findViewById(R.id.opcard2);
        card3 = (CardView) findViewById(R.id.opcard3);
        card4 = (CardView) findViewById(R.id.opcard4);
        card5 = (CardView) findViewById(R.id.opcard5);


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), optact1.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), optact2.class));
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), optact3.class));
            }
        });


        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), optact4.class));
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), optact5.class));
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