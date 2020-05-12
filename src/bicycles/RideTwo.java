package bicycles;

public class RideTwo implements Bicycle{

    int speed=0;
    public void brake(){
        speed=-5;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed=0;
    }
    public void accelerate(){
        speed=+10;
    }
}
