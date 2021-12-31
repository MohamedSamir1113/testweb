package com.example.demo.Core;

import java.util.ArrayList;

public class Driver extends UserAccount{
    public boolean isVerified = false;
    ArrayList<String> FavAreas = new ArrayList<>();
    String nationalID;
    String driverLicense;
    // FavAreasclass objfavarea;
    Ride[] historyofrides;
    public Driver(){
        //objfavarea.subscribe(this);
    }
    public Driver(String Id, String Dl)
    {
        nationalID=Id;
        driverLicense=Dl;
        //objfavarea.subscribe(this);
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void Verify(){
        isVerified=true;
    }

    public boolean addFavoriteLocation(String location)
    {
        FavAreas.add(location);
        return true;
    }
    public ArrayList<String> getFavoriteLocation()
    {
        System.out.println("inside Driver class pls not null");
        return this.FavAreas;
    }

}
