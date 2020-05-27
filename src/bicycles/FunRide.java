package bicycles;

import java.util.ArrayList;

class FunRide {
    ArrayList<BicycleType> list=new ArrayList<BicycleType>();
     private int maxBikes;

     FunRide(int maxBikes){
         this.maxBikes=maxBikes;
     }
    public void accept( BicycleType bicycleType){

      if(list.size()>maxBikes && !list.contains(bicycleType)){
       list.add(bicycleType);
       System.out.println("accepted");
      }else{
       System.out.println("not accepted");
      }
    }
    public int getCountForType(BicycleType bi) {
     int count = 0;
     for (int i = 0; i < list.size(); i++) {
      if (list.contains(bi)) {
       count = +1;
      }
     }
     return count;
    }
}
