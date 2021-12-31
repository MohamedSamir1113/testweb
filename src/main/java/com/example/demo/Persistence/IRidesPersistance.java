package com.example.demo.Persistence;

import com.example.demo.Core.Ride;

import java.util.ArrayList;
import java.util.HashMap;

public interface IRidesPersistance {
    public boolean addRide(Ride ride);

    public HashMap<Integer,Ride> getAllRides();

    public HashMap<Integer, Ride> getIntrestedRides(ArrayList<String> location);

    public boolean addOffer(int key, Double offer);

    public boolean SetUser(int key, int Id);

    public boolean end(int key);
}
