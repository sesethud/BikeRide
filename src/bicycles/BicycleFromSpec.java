package bicycles;

public class BicycleFromSpec {

    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
//prints 11
System.out.println(roadBikeSpec.getAccelerationSpeed());
//prints 4
System.out.println(roadBikeSpec.getBrakeSpeed());

    BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
//prints 5
System.out.println(mountainBikeSpec.getAccelerationSpeed());
//prints 3
System.out.println(mountainBikeSpec.getBrakeSpeed());
}
