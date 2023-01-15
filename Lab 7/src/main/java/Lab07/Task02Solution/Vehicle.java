package Lab07.Task02Solution;

public class Vehicle implements IVehicle{
    protected int distanceKM;
    protected int timeMinutes;
    protected int numberOfPassengers;


    public int perHeadFare(){
        int fare;
        if (distanceKM < 10)
            fare = 300 / numberOfPassengers;
        else
            fare = distanceKM * 30 / numberOfPassengers;

        return fare - (fare % 5);
    }
    public  boolean canTakeTrip(){
        if (numberOfPassengers < 1)
            return false;

        return numberOfPassengers == 1 && distanceKM <= 10;
    }
}
