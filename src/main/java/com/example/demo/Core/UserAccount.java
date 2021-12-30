package com.example.demo.Core;

public class UserAccount {
    String username ,password ,email ,MobileNumber;
    public UserAccount()
    {

    }
    public UserAccount(String username, String password, String email , String MobileNumber)
    {
        this.username=username;
        this.password=password;
        this.email=email;
        this.MobileNumber=MobileNumber;

    }
    public UserAccount(String username, String password)
    {
        this.username=username;
        this.password=password;


    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
