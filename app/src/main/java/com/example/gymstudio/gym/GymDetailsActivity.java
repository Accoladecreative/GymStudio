package com.example.gymstudio.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gymstudio.R;
import com.example.gymstudio.plan.AddPlanDialog;

import static com.example.gymstudio.gym.GymAdapter.DETAILS;
import static com.example.gymstudio.gym.GymAdapter.IMAGE;
import static com.example.gymstudio.gym.GymAdapter.PLAN;

public class GymDetailsActivity extends AppCompatActivity {
    TextView gymDetails,gymPlan;
    ImageView gymImage;
    Button btnAddPlan;



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

        btnAddPlan = findViewById(R.id.add_to_plan);
        btnAddPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               AddPlanDialog dialog = new AddPlanDialog();
               Bundle bundle = new Bundle();
//               bundle.putParcelable("extra", );
                dialog.show(getSupportFragmentManager(),"this is a tag");

            }
        });

    }
}






