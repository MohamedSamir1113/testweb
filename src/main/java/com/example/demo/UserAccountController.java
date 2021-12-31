package com.example.demo;

import com.example.demo.Core.LoginDto;
import com.example.demo.Persistence.HashmapPersistance;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Core.UserAccount;
import com.example.demo.Core.Driver;
import com.example.demo.application.UserAccountService;
import com.example.demo.application.IUserAccountService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class UserAccountController {

    private IUserAccountService s1 = new UserAccountService();
    @PostMapping("/register")
    public boolean register(@RequestBody UserAccount account) {
        return s1.register(account);
    }

    @PostMapping("/login")
    public boolean userlogin(@RequestBody LoginDto login){return s1.login(login.getUsername(), login.getPassword());}

    @PostMapping("/driverlogin")
    public  boolean login(@RequestBody LoginDto login){
        return  s1.login(login.getUsername(), login.getPassword());
    }

    @GetMapping("/getinfo")
    public HashMap<Integer, UserAccount> getAll(){return s1.getAll();}

    @PostMapping("/driverRegister")
    public boolean driverRegister(@RequestBody Driver driver){return s1.register(driver);}

};
