package com.example.gymstudio.gym;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gymstudio.R;

import java.util.ArrayList;

public class AllGyms extends AppCompatActivity {

    GymAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_gyms);
        setTitle("All Gyms");

        recyclerView = findViewById(R.id.my_gym_list);
        adapter = new GymAdapter(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        Gym gym0 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym0,"Press Up");
        Gym gym1 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym1,"Pull up");
        Gym gym2 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym2,"Weight Lifting");
        Gym gym3 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym3,"Cat Wheel");
        Gym gym4 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym4,"Running");
        Gym gym5 = new Gym("This is the gym we are talking about and its for stretching the back and muscles",R.drawable.gym5,"Stretcher");
        ArrayList<Gym> myGym = new ArrayList<>();
        myGym.add(gym0);
        myGym.add(gym1);
        myGym.add(gym2);
        myGym.add(gym3);
        myGym.add(gym4);
        myGym.add(gym5);


        adapter.setGym(myGym);




    }
}