package bicycles;

public class RideOne implements Bicycle {

    int speed=0;
    public void brake(){
        speed=-3;
    }
    public int currentSpeed(){
        return speed;
    }
    public void stop(){
        speed=0;
    }
    public void accelerate(){
        speed=+9;
    }
}

