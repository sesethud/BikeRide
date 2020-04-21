abstract class BicycleBase implements Bicycle{
    private int speed=0;
    protected void changeSpeed(int change){
        speed=+change;
    }
    public void stop();
    public void currentSpeed();
}