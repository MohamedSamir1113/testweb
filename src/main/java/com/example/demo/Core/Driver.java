package com.example.demo.Core;

import java.util.ArrayList;

public class Driver {
    boolean isVerified;

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
}
