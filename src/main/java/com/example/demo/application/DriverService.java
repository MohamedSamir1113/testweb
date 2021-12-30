package com.example.demo.application;

import com.example.demo.Core.Ride;

import java.util.ArrayList;

public class DriverService implements IDriverService {
    boolean isVerified;
    ArrayList<String> FavAreas = new ArrayList<>();
    ArrayList<Ride> DriverHistory = new ArrayList();
    ArrayList<Ride> IntrestedRides = new ArrayList<>();

    @Override
    public boolean locationisfav(String userlocation)//checks if the input of the user is in driver's fav area update of observer pattern
    {
        for(String i : FavAreas)
        {
            if(i.contentEquals(userlocation)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean AddIntredRide(Ride r1, String Userlocation){ // user inputting his rides
        for(String i : FavAreas)
        {
            if(i.contentEquals(Userlocation))
            {
                IntrestedRides.add(r1);
            }

        }
        return  true;
    }

    @Override
    public boolean DisplayIntredRides()//
    {
        for(Ride i : IntrestedRides)
        {
            System.out.println(i.getSource()+" "+i.getDistination());
        }
        return true;
    }
    @Override
    public void addfavarea(String newfavarea)
    {
        FavAreas.add(newfavarea);
    }
    @Override
    public void setVerified(boolean verified) {
        isVerified = verified;
    }
    @Override
    public boolean isVerified() {
        return isVerified;
    }
    @Override
    public ArrayList<String> getFavAreas(){
        return FavAreas;
    }
}
