package com.company;

import bicycles.*;
import models.MountainBike;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sesethu Dumezweni! ");
        Bicycle bicycle =new MountainBike();
        RideOne bikeRide=new RideOne();
        bikeRide.ride(bicycle);
        System.out.println(bicycle.currentSpeed());
	// write your code here

    //Testing the funride class
        FunRide funride=new FunRide(6);
        funride.accept(BicycleType.MOUNTAINBIKE);
        funride.accept(BicycleType.MOUNTAINBIKE);
        funride.accept(BicycleType.TANDEM);
        funride.accept(BicycleType.TANDEM);
        funride.accept(BicycleType.MOUNTAINBIKE);

        System.out.println("getcount"+funride.getCountForType(BicycleType.TANDEM));

        //Testing bicycleSpecification class

        BicycleSpecification biSpec=new BicycleSpecification(5,3,BicycleType.MOUNTAINBIKE);
        System.out.println(biSpec.getBicycleType());
        System.out.println(biSpec.getBrakeSpeed());


    }


}