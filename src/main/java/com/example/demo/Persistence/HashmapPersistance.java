package com.example.demo.Persistence;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

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
    public boolean login(String usname, String passwd)
    {
        for (Integer i : Accounts.keySet()) {

            if(Accounts.get(i).getUsername().contentEquals(usname) && Accounts.get(i).getPassword().contentEquals(passwd)  )
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
