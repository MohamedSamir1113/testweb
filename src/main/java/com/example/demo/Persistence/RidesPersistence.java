package com.example.demo.Persistence;

import com.example.demo.Core.Ride;


import java.util.ArrayList;
import java.util.HashMap;


public class RidesPersistence implements  IRidesPersistance{
    Integer key=1;

    HashMap<Integer, Ride> Rides = new HashMap<Integer, Ride>();
    HashMap<Integer, Ride> IntrestedRides = new HashMap<Integer,Ride>();
    private static RidesPersistence inst;


    public static IRidesPersistance getInstance() {
        if(inst == null) {
            inst = new RidesPersistence();
        }
        return inst;
    }
    @Override
    public boolean addRide(Ride ride)
    {
        Rides.put(key,ride);
        key++;
        return true;
    }
    @Override
    public HashMap<Integer,Ride>  getAllRides(){
        return Rides;
    }
    @Override
    public HashMap<Integer, Ride> getIntrestedRides(ArrayList<String> location)//location is Driver favareas
    {

        System.out.println("inside the getIntresed Rides");
        for(Integer i : Rides.keySet())
        {
            Integer v=0;
            for(String x : location)
            {

                //System.out.println(Rides.get(i).getSource()+" =! "+location.toString())
                if(/*Rides.get(i).getSource().equals(location.get(v))*/location.get(v).equals(Rides.get(i).getSource()))
                {
                    System.out.println("inside if");
                    IntrestedRides.put(i, Rides.get(i));
                    System.out.println("end of if");
                }
                v++;
            }

        }
        return IntrestedRides;
    }
    @Override
    public boolean addOffer(int key, Double offer)
    {
        IntrestedRides.get(key).setOffer(offer);
        return true;
    }
    @Override
    public boolean SetUser(int key, int Id)
    {
        IntrestedRides.get(key).setUserId(Id);
        return true;
    }
    @Override
    public boolean end(int key)
    {
        IntrestedRides.remove(key);
        Rides.remove(key);
        return true;
    }




}

