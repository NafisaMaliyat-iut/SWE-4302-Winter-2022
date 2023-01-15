package Lab07.Task02Solution;

public class SevenSeater extends Vehicle{
    //default farePerHead

    public boolean canTakeTrip(){
        if (numberOfPassengers < 1)
            return false;

        return numberOfPassengers <= 7 && distanceKM >= 10;
    }

    public SevenSeater(int distanceKM,
                       int timeMinutes,
                       int numberOfPassengers)
    {
        super.distanceKM = distanceKM;
        super.timeMinutes = timeMinutes;
        super.numberOfPassengers = numberOfPassengers;
    }
}
