package Lab07Test.Task02ProblemTest;

import Lab07.Task02Problem.Trip;
import Lab07.Task02Problem.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TripTest {

    //test for fare calculation for sedan
    @Test
    public void testFarePerHeadForSedan(){
        Trip trip = new Trip(VehicleType.SEDAN,50, 72, 3);

        int expectedFare = (50 + (50 * 30) + (72 * 2)) / 3;
        expectedFare = expectedFare - (expectedFare % 5);

        assertEquals(expectedFare, trip.perHeadFare());

    }


    @Test
    public void testFarePerHeadForMotorBike(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE,33, 43, 5);

        int expectedFare = Math.max(25, 33 * 20) / 5;
        expectedFare = expectedFare - (expectedFare % 5);

        assertEquals(expectedFare, trip.perHeadFare());

    }


    @Test
    public void testFarePerHeadForSevenSeater1(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER,18, 82, 9);

        int expectedFare = 18 * 30 / 9;
        expectedFare = expectedFare - (expectedFare % 5);

        assertEquals(expectedFare, trip.perHeadFare());

    }

    @Test
    public void testFarePerHeadForSevenSeater2(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER,8, 76, 3);

        int expectedFare = 300/3;
        expectedFare = expectedFare - (expectedFare % 5);

        assertEquals(expectedFare, trip.perHeadFare());

    }

    @Test
    public void canTakeTripForSedan() {
        //wrong number of passengers
        Trip trip = new Trip(VehicleType.SEDAN, 25, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //wrong distance
        trip = new Trip(VehicleType.SEDAN, 30, 45, 4);
        assertTrue(trip.canTakeTrip() == false);

        //wrong number of passenger and distance
        trip = new Trip(VehicleType.SEDAN, 30, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //correct
        trip = new Trip(VehicleType.SEDAN, 25, 45, 4);
        assertTrue(trip.canTakeTrip() == true);
    }


    @Test
    public void canTakeTripForMotorBike() {
        //wrong number of passengers
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 7, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //wrong distance
        trip = new Trip(VehicleType.MOTOR_BIKE, 11, 45, 1);
        assertTrue(trip.canTakeTrip() == false);

        //wrong number of passenger and distance
        trip = new Trip(VehicleType.MOTOR_BIKE, 11, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //correct
        trip = new Trip(VehicleType.MOTOR_BIKE, 10, 45, 1);
        assertTrue(trip.canTakeTrip() == true);
    }

    @Test
    public void canTakeTripForSevenSeater(){
        //wrong number of passengers
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 10, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //wrong distance
        trip = new Trip(VehicleType.SEVEN_SEATER, 2, 45, 7);
        assertTrue(trip.canTakeTrip() == false);

        //wrong number of passenger and distance
        trip = new Trip(VehicleType.SEVEN_SEATER, 2, 45, 8);
        assertTrue(trip.canTakeTrip() == false);

        //correct
        trip = new Trip(VehicleType.SEVEN_SEATER, 10, 45, 7);
        assertTrue(trip.canTakeTrip() == true);
    }


}
