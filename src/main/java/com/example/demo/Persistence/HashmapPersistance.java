package com.example.demo.Persistence;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.Core.UserAccount;

public class HashmapPersistance implements  Storage{
    Integer key=1;
    HashMap<Integer, UserAccount> Accounts = new HashMap<Integer, UserAccount>();


    @Override
    public boolean register(UserAccount account)
    {
        Accounts.put(key,account);
        key++;
        return  true;
    }

    @Override
    public boolean login(String username, String password)
    {
        for (Integer i : Accounts.keySet()) {

            if(Accounts.get(i).getUsername().contentEquals(username) && Accounts.get(i).getPassword().contentEquals(password))
            {
                System.out.println("valid, welcome user");
                return true;
            }
        }
        return false;
    }
    @Override
    public HashMap<Integer,UserAccount> getAll() {
        return Accounts;
    }

}
