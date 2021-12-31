package com.example.demo.application;


import com.example.demo.Core.Ride;
import com.example.demo.Core.UserAccount;

import java.util.HashMap;

public interface IRidesService {
    public boolean addRide(Ride ride);
    public HashMap<Integer, Ride> getAllRides();
    public HashMap<Integer, Ride> getIntrestedRides(int key);
    public UserAccount getDriveFavoriteRides(int key);
    public boolean addOffer(int key, Double offer);
    public boolean SetUser(int key, int ID);
    public boolean end(int key);
}
