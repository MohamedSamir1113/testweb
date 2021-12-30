package com.example.demo.application;
import java.util.HashMap;
import com.example.demo.Core.UserAccount;
import com.example.demo.Persistence.Storage;
import com.example.demo.Persistence.HashmapPersistance;

public class UserAccountService implements  IUserAccountService{
    private Storage s1 = new HashmapPersistance();
    @Override
    public boolean register(UserAccount account) {return s1.register(account);}

    @Override
    public boolean login(String usname, String passwd) {
        return s1.login(usname, passwd);
    }

    @Override
    public HashMap<Integer, UserAccount> getAll() {
        return s1.getAll();
    }


}
