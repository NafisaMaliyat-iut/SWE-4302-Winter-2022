package Lab07.Task02Solution;


public class VehicleFactory {
    public IVehicle getVehicleType(VehicleType vehicleType,
                                          int distanceKM,
                                          int timeMinutes,
                                          int numberOfPassengers) {
        IVehicle iVehicle;
        if(vehicleType.equals(VehicleType.SEVEN_SEATER)) {
            iVehicle = new SevenSeater(distanceKM, timeMinutes, numberOfPassengers);
        } else if (vehicleType.equals(VehicleType.SEDAN)) {
            iVehicle = new Sedan(distanceKM, timeMinutes, numberOfPassengers);
        } else iVehicle = new MotorBike(distanceKM, timeMinutes, numberOfPassengers);

        return iVehicle;
    }
}
