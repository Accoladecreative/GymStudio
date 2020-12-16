package com.example.gymstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAllGym, btnYourPlans,btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnYourPlans = findViewById(R.id.your_plans);
        btnAllGym = findViewById(R.id.all_gyms);
        btnAboutUs = findViewById(R.id.about);


        btnAllGym.setOnClickListener(view ->  startActivity(new Intent(this, AllGyms.class)));

        btnYourPlans.setOnClickListener(view -> {

        });
        btnAboutUs.setOnClickListener(view -> {

        });


    }
 }