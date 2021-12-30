package com.example.demo.application;
import java.util.HashMap;
import com.example.demo.Core.UserAccount;

public interface IUserAccountService {
    public boolean register(UserAccount account);

    public boolean login(String usname, String passwd);
    public HashMap<Integer,UserAccount> getAll();
}
