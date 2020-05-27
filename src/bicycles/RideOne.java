package bicycles;
public class RideOne implements BikeRide {
    public void ride(Bicycle bicycle){

        //Taking MountainBike for a rides

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
       // bicycle.stop();
    }
}

