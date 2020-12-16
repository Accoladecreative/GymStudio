package com.example.gymstudio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class GymAdapter extends RecyclerView.Adapter<GymAdapter.GymViewHolder> {
    ArrayList<Gym> gym = new ArrayList<>();
    Context context;

    public GymAdapter(Context context) {
        this.context = context;
    }
    public static final String DETAILS = "com.example.gymstudio.Gym.details";
    public static final String IMAGE = "com.example.gymstudio.Gym.image";
    public static final String PLAN = "com.example.gymstudio.Gym.plan";
    @NonNull
    @Override
    public GymViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        return new GymViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull GymViewHolder holder, int position) {
        holder.gymDetails.setText(gym.get(position).getDetails());
        Glide.with(context).asBitmap().load(gym.get(position).getImage()).into(holder.gymImage);
        holder.gymPlan.setText(gym.get(position).getPlan());


        holder.gymList.setOnClickListener(view -> {
            Intent intent = new Intent(context,GymDetailsActivity.class);
            intent.putExtra(DETAILS,gym.get(position).getDetails());
            intent.putExtra(IMAGE,gym.get(position).getImage());
            intent.putExtra(PLAN,gym.get(position).getPlan());
            context.startActivity(intent);
        });






    }

    @Override
    public int getItemCount() {
        return gym.size();
    }

    public void setGym(ArrayList<Gym> gym) {
        this.gym = gym;
        notifyDataSetChanged();
    }

    static class GymViewHolder extends RecyclerView.ViewHolder{
        TextView gymDetails,gymPlan;
        ImageView gymImage;
        CardView gymList;

        public GymViewHolder(@NonNull View itemView) {
            super(itemView);
            gymDetails = itemView.findViewById(R.id.gym_details);
            gymImage = itemView.findViewById(R.id.gym_image);
            gymPlan = itemView.findViewById(R.id.your_plans);
            gymList = itemView.findViewById(R.id.list_item);
        }
    }
}
