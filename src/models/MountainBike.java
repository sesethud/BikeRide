package models;
import bicycles.BicycleBase;
import bicycles.BicycleTest;

public class MountainBike extends BicycleBase{
public void accelerate(){
    changeSpeed(5);
}
    public void brake() {
        changeSpeed(-3);
    }
}
