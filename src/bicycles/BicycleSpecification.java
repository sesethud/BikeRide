package bicycles;

public class BicycleSpecification {

   // class BicycleSpecification {
        private int accelerationSpeed;
        // add a variable for brakeSpeed
        private int brakeSpeed;
        BicycleType bicycleType;
        private int getAccelerationSpeed;

        public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
            // existing code above this
            this.bicycleType = bicycleType;
            this.accelerationSpeed=accelerationSpeed;
            this.brakeSpeed=brakeSpeed;
        }
        public BicycleType getBicycleType(){
            return bicycleType;
        }
        // add getters for brakeSpeed
        public int getBrakeSpeed(){
            return brakeSpeed;
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



