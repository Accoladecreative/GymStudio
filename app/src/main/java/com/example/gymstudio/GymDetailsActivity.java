package com.example.gymstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import static com.example.gymstudio.GymAdapter.DETAILS;
import static com.example.gymstudio.GymAdapter.IMAGE;
import static com.example.gymstudio.GymAdapter.PLAN;

public class GymDetailsActivity extends AppCompatActivity {
    TextView gymDetails,gymPlan;
    ImageView gymImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_details);
        setTitle("Gym Details");


        Intent intent = getIntent();
        if(intent==null){
            Toast.makeText(this, "No Gyms Found!", Toast.LENGTH_SHORT).show();
            finish();
        }
        else if(intent != null){
            gymDetails = findViewById(R.id.detail_gym_details);
            gymImage = findViewById(R.id.detail_gym_image);
            gymPlan = findViewById(R.id.detail_gym_plan);

            gymDetails.setText(intent.getStringExtra(DETAILS));
            gymImage.setImageResource(intent.getIntExtra(IMAGE,-1));
            gymPlan.setText(intent.getStringExtra(PLAN));

        }

        if(gymPlan.isSelected()){


        }


    }
}