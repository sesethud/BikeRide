package models;
 import bicycles.BicycleBase;

 public class RoadBike extends BicycleBase{
  //int speed=0;
  public void accelerate(){
     changeSpeed(11);
    }
  public void brake() {
    changeSpeed(-4);
  }
 }
