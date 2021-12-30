package com.example.demo;

import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.application.DriverService;
import com.example.demo.application.IDriverService;
import com.example.demo.application.IDriverService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import java.util.ArrayList;

@RestController
public class DriverController {
    private IDriverService d1 = new DriverService();

    @PostMapping("/lovationisfav")
    public boolean locationisfav(@RequestBody  String userlocation)//checks if the input of the user is in driver's fav area update of observer pattern
    {
        return  d1.locationisfav(  userlocation);
    }

    @PostMapping("/addride")
    public boolean AddIntredRide(@RequestBody Ride r1, String Userlocation){ // user inputting his rides
        return d1.AddIntredRide( r1, Userlocation);
    }
    @GetMapping("/displayrides")
    public void DisplayIntredRides()//
    {
        d1.DisplayIntredRides();
    }

    @PostMapping("/addarea")
    public void addfavarea(@RequestBody String newfavarea)
    {
        d1.addfavarea(newfavarea);
    }

    @PostMapping("/verify")
    public void setVerified(@RequestBody boolean verified) {d1.setVerified(verified);}

    @GetMapping("/isverified")
    public boolean isVerified() {
        return  d1.isVerified();
    }

    @GetMapping("/getareas")
    public ArrayList<String> getFavAreas(){return d1.getFavAreas();}
}
