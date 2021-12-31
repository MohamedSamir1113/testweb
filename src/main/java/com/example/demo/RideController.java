package com.example.demo;

import java.util.HashMap;
import java.util.List;

import com.example.demo.Core.Ride;
import com.example.demo.application.IRidesService;

import com.example.demo.application.IUserAccountService;
import com.example.demo.application.RidesService;
import com.example.demo.application.UserAccountService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideController {
    private IRidesService r1 = new RidesService();

    @PostMapping("/requestRide")
    public boolean addRide(@RequestBody Ride ride){return r1.addRide(ride);}

    @GetMapping("/listAllPendingRides")
    public HashMap<Integer, Ride> getAllRides(){return r1.getAllRides();}

    @GetMapping("/getInterestedRides/{key}")
    public HashMap<Integer, Ride> getIntrestedRides(@PathVariable int key){return r1.getIntrestedRides(key);}

    @PostMapping("/addOffer/{key}")
    public boolean addOffer(@PathVariable int key, @RequestBody double offer){return r1.addOffer(key,offer);}
    @PostMapping("/setUser/{key}")
    public boolean SetUser(@PathVariable  int key,@RequestBody int userId){return r1.SetUser(key,userId);}


}