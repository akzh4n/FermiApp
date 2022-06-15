package com.example.newfermiapp.topics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.newfermiapp.R;
import com.example.newfermiapp.TopicsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Quantum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantum);


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