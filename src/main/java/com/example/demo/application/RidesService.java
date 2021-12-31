package com.example.demo.application;

import com.example.demo.Core.Ride;
import com.example.demo.Core.UserAccount;
import com.example.demo.Core.Driver;
import com.example.demo.Persistence.HashmapPersistance;
import com.example.demo.Persistence.IRidesPersistance;
import com.example.demo.Persistence.RidesPersistence;
import com.example.demo.Persistence.Storage;

import java.util.HashMap;

public class RidesService implements IRidesService  {

    private IRidesPersistance r1 = new RidesPersistence();
    IUserAccountService s1 = new UserAccountService();
    @Override
    public boolean addRide( Ride ride){
        return r1.addRide(ride);}
    @Override
    public HashMap<Integer, Ride> getAllRides(){return  r1.getAllRides();}

    @Override
    public HashMap<Integer, Ride> getIntrestedRides(int key) {
        return r1.getIntrestedRides(getDriveFavoriteRides(key).getFavoriteLocation());
    }
    @Override
    public Driver getDriveFavoriteRides(int key){
        System.out.println("ezayak");
        return (Driver) s1.getAccount(key);}
    @Override
    public boolean addOffer(int key, Double offer){return r1.addOffer(key,offer); }
    @Override
    public boolean SetUser(int key, int ID){return r1.SetUser(key,ID);}
    @Override
    public boolean end(int key){return r1.end(key);};

}
