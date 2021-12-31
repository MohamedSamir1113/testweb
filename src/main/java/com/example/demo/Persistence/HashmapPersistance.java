package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Core.UserAccount;

public class HashmapPersistance implements  Storage{
    Integer key=1;
    HashMap<Integer, UserAccount> Accounts = new HashMap<Integer, UserAccount>();
    HashMap<Integer, UserAccount> PendingDrivers = new HashMap<Integer, UserAccount>();
    private static HashmapPersistance instance;

    public static Storage getInstance() {
        if(instance == null) {
            instance = new HashmapPersistance();
        }
        return instance;
    }


    @Override
    public boolean register(UserAccount account)
    {
        Accounts.put(key,account);
        key++;
        return  true;
    }

    public boolean userlogin(String username, String password)
    {
        for (Integer i : Accounts.keySet()) {

            if(Accounts.get(i).getUsername().contentEquals(username) && Accounts.get(i).getPassword().contentEquals(password))
            {
                if(Accounts.get(i) instanceof Driver== false) ;
                System.out.println("valid, welcome user");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(String username, String password)
    {
        for (Integer i : Accounts.keySet()) {

            if(Accounts.get(i).getUsername().contentEquals(username) && Accounts.get(i).getPassword().contentEquals(password))
            {
                if(Accounts.get(i) instanceof Driver) return ((Driver) Accounts.get(i)).isVerified;
                System.out.println("valid, welcome user");
                return true;
            }
        }
        return false;
    }
    @Override
    public HashMap<Integer, UserAccount>  getAllPendingDrivers()
    {
        for(Integer i : Accounts.keySet())
        {
            if(Accounts.get(i) instanceof Driver && ((Driver) Accounts.get(i)).isVerified== false)
            {
                PendingDrivers.put(i,Accounts.get(i));
            }
        }
        return PendingDrivers;
    }
    @Override
    public HashMap<Integer,UserAccount> getAll() {
        return Accounts;
    }
    @Override
    public boolean verifyDriver(int key)
    {
        ((Driver) Accounts.get(key)).Verify();
        PendingDrivers.remove(key);
        return true;
    }
    @Override
    public boolean addFavoriteLocation(int key, String location)
    {
        ((Driver) Accounts.get(key)).addFavoriteLocation(location);
        return true;
    }
    @Override
    public ArrayList<String> getFavoriteLocation(int key){
        System.out.println("Inside Hashmap Fav location return");
        System.out.println("the key is "+key);
        System.out.println("habullah");
        System.out.println(((Driver) Accounts.get(key)).isVerified);
        System.out.println("abdo razik");
        return ((Driver) Accounts.get(key)).getFavoriteLocation();
    }
    public Driver getAccount(int key) {
        return ((Driver) Accounts.get(key));
    }


}
