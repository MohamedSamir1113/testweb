package com.example.demo.Persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Core.Driver;
import com.example.demo.Core.UserAccount;
public interface Storage {

    public boolean register(UserAccount account);

    public boolean login(String username, String password);

    public HashMap<Integer,UserAccount> getAll();

    public HashMap<Integer, UserAccount>  getAllPendingDrivers();

    public boolean verifyDriver(int key);

    public boolean addFavoriteLocation(int key, String location);

    public ArrayList<String> getFavoriteLocation(int key);

    public Driver getAccount(int key );

    public boolean userlogin(String username, String password);


}
