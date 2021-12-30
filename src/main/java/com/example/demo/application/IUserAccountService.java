package com.example.demo.application;

import com.example.demo.Core.UserAccount;

import java.util.HashMap;

public interface IUserAccountService {
    public boolean register(UserAccount account);

    public boolean login(String username, String password);

    public HashMap<Integer,UserAccount> getAll();
}
