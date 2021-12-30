package com.example.demo;

import com.example.demo.Core.Ride;
import com.example.demo.Persistence.HashmapPersistance;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.UserAccount;
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


    private IUserAccountService s1= new UserAccountService();
    @PostMapping("/register")
    public boolean register(@RequestBody UserAccount account) {
        return s1.register(account);
    }
    //@PostMapping("/login/add")
    @PostMapping("/login")
    public  boolean login(@RequestBody String usname, String passwd){
            return  s1.login(usname, passwd);
    }




    }

