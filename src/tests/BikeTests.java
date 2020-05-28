package tests;


import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.FunRide;
import models.MountainBike;
import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BikeTests {

    @Test

    public void shouldAccelerateBrakeMountainBike() {
        Bicycle bicycle = new MountainBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(2, bicycle.currentSpeed(),"The mountain bike");
    }

    @Test
    public void shouldAccelerateRoadBike(){
        Bicycle bicycle=new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7,bicycle.currentSpeed(),"RoadBike Test-");
    }


    @Test
    public void testFunRide(){
        FunRide funride=new FunRide(6);
        funride.accept(BicycleType.MOUNTAINBIKE);
        funride.accept(BicycleType.MOUNTAINBIKE);
        funride.accept(BicycleType.TANDEM);
        funride.accept(BicycleType.TANDEM);
        funride.accept(BicycleType.MOUNTAINBIKE);
        assertEquals(1,funride.getCountForType(BicycleType.TANDEM),"Tandem");
    }

}
