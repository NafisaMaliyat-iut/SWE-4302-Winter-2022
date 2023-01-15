package Lab07.Task02Solution;



public class Trip {
    private IVehicle type;
    private int distanceKM;
    private int timeMinutes;
    private int numberOfPassengers;

    //constructor
    public Trip(VehicleType type,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {
        this.type = new VehicleFactory().getVehicleType(type, distanceKM, timeMinutes, numberOfPassengers);
    }


    public int perHeadFare(){

        return type.perHeadFare() ;
    }
    public  boolean canTakeTrip() {
        return type.canTakeTrip();
    }
}
