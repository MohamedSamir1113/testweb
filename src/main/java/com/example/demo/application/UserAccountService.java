package com.example.demo.application;

import com.example.demo.Core.UserAccount;
import com.example.demo.Persistence.HashmapPersistance;
import com.example.demo.Persistence.Storage;

import java.util.HashMap;

public class UserAccountService implements  IUserAccountService{
    private Storage s1 = new HashmapPersistance();
    @Override
    public boolean register(UserAccount account) {return s1.register(account );}

    @Override
    public boolean login(String username, String password) {
        return s1.login(username, password);
    }

    @Override
    public HashMap<Integer, UserAccount> getAll() {
        return s1.getAll();
    }


}
