package Lab07.Task02Solution;

public class MotorBike extends Vehicle{

    public MotorBike(int distanceKM,
                       int timeMinutes,
                       int numberOfPassengers)
    {
        super.distanceKM = distanceKM;
        super.timeMinutes = timeMinutes;
        super.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public int perHeadFare(){
        int fare;
        fare = Math.max(25, super.distanceKM * 20) / super.numberOfPassengers;

        return fare - (fare % 5);
    }

    //default canTakeTrip
}
