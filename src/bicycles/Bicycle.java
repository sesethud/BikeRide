package bicycles;


interface Bicycle{

    public void accelerate();
    public void brake();
    public int currentSpeed();
    public void stop();
/*****These are the attributes of Bicycle as a class
 *
 *
public class Bicycle {
    private int speed;
    public void accelerate (){
         int speed=+5;
    }
    public void brake(){
        int speed=-3;
    }
    public int currentSpeed(){
         return speed;
    }
    public void stop(){
        int speed =0;
    }
*/
}
