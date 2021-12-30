package com.example.demo.Persistence;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Core.UserAccount;
public interface Storage {

    public boolean register(UserAccount account);

    public boolean login(String usname, String passwd);

    public HashMap<Integer,UserAccount> getAll();
}