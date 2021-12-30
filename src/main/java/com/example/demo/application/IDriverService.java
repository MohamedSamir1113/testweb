package com.example.demo.application;

import com.example.demo.Core.Ride;

import java.util.ArrayList;

public interface IDriverService {
    public boolean locationisfav(String userlocation);

    public boolean AddIntredRide(Ride r1, String Userlocation);

    public boolean DisplayIntredRides();

    public void addfavarea(String newfavarea);

    public void setVerified(boolean verified);

    public boolean isVerified();

    public ArrayList<String> getFavAreas();
}
