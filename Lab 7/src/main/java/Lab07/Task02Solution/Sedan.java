package Lab07.Task02Solution;

public class Sedan extends Vehicle{

    public Sedan(int distanceKM,
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
        fare = (50 + super.distanceKM * 30 + super.timeMinutes * 2) / super.numberOfPassengers;

        return fare - (fare % 5);
    }

    @Override
    public boolean canTakeTrip(){
        if (numberOfPassengers < 1)
            return false;

        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
}
