package bicycles;

  public  abstract class BicycleBase implements Bicycle{
        private int speed=0;

        protected void changeSpeed(int change){
            speed=+change;
        }
        public void stop(){
            speed=0;
        }
        public int currentSpeed(){
            return speed;
        }
        public  void accelerate(){
            changeSpeed(speed);
      }
    }

