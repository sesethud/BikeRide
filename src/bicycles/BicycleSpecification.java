package bicycles;
enum BicycleType {
    ROADBIKE,
    MOUNTAINBIKE,
    TANDEM
}
public class BicycleSpecification extends BicycleBase{

   // class BicycleSpecification {
        private int accelerationSpeed;
        // add a variable for brakeSpeed
        private int brakeSpeed;


        public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
            // existing code above this
            this.bicycleType = bicycleType;
        }
        public BicycleType getBicycleType(){
            return bicycleType;
        }
        // add getters for brakeSpeed
        public int getBrakeSpeed(){
            return brakeSpeed;
        }
        public BicycleType getBicycleType(){
            return BicycleType;
        }
    }


    /*private int accelerationSpeed;
    // add a variable for brakeSpeed
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed= brakeSpeed;// initialize brakeSpeed private variable
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    // add getters for brakeSpeed
    public int getBrakeSpeed(){

        return brakeSpeed;
    }
    public void brake(){
        speed -= breakSpeed;
    }*/



