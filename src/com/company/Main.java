package com.company;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.RideOne;
import models.MountainBike;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sesethu Dumezweni! ");
        Bicycle bicycle =new MountainBike();
        RideOne bikeRide=new RideOne();
        bikeRide.ride(bicycle);
        System.out.println(bicycle.currentSpeed());
	// write your code here
    }
}