package com.example.demo.Core;

public class UserAccount {
    String username ,password ,email ,mobilenumber;
    public UserAccount()
    {

    }
    public UserAccount(String username, String password, String email , String mobilenumber)
    {
        this.username=username;
        this.password=password;
        this.email=email;
        this.mobilenumber=mobilenumber;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail(){return email;}

    public String getmobilenumber(){return mobilenumber;}
}
