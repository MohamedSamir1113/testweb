package com.example.demo.Core;

public class Ride {
    //private int id;
    private int userId;
    private Double offer;
    private boolean isPending;
    private String source;
    private String distination;

    public Ride() {
    }

    public Ride(String source, String distination) {
        this.source = source;
        this.distination = distination;
    }

    // public void setId(int id) {this.id = id;}

    //public int getId() {return this.id;}

    public String getSource() {
        return this.source;
    }

    public String getDistination() {
        return this.distination;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public Double getOffer(){
        return offer;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }
}
