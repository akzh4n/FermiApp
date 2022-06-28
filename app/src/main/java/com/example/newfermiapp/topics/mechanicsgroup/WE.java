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
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WE extends AppCompatActivity {


    private CardView card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation3);
        card1 = (CardView) findViewById(R.id.kinemcard1) ;


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), weact1.class));
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