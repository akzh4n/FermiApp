package com.example.newfermiapp.topics.mechanicsgroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.newfermiapp.R;
import com.example.newfermiapp.TopicsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dynamics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamics);


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