package com.example.gymstudio;

public class Gym {
    String details,plan;
    int image;


    public Gym(String details, int image, String plan) {
        this.details = details;
        this.image = image;
        this.plan = plan;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
