package com.example.demo.application;

import com.example.demo.Core.Ride;

import com.example.demo.Core.UserAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;

public interface IDriverService {
    public HashMap<Integer, UserAccount> getAllpendingDriver();


    public boolean locationisfav(String userlocation);

    public boolean AddIntredRide(Ride r1, String Userlocation);

    public boolean DisplayIntredRides();

    public void addfavarea(String newfavarea);

    public void setVerified(boolean verified);

    public boolean isVerified();

    public ArrayList<String> getFavAreas();

    public boolean verifyDriver(int key);

    public boolean addFavoriteLocation(int key, String location);

    public ArrayList<String> getFavoriteLocation(int key);


}
