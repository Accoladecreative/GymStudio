package com.example.gymstudio.plan;

import com.example.gymstudio.gym.Gym;


public class Plan {
    Gym gym;
    int minutes;
    String day;
    boolean completed;

    public Plan(Gym gym, int minutes, String day, boolean completed) {
        this.gym = gym;
        this.minutes = minutes;
        this.day = day;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}
