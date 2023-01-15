package Lab05.Task01Test;

import Lab05.Task01.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    @Test
    void DivisibleByThreeTest() {
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(2727));
    }

    @Test
    void DivisibleBySevenTest() {
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(5656));
    }

    @Test
    void DivisibleByThreeAndSevenTest() {
        String expected = "Fizzbuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(2121));
    }

    @Test
    void NotDivisibleByThreeOrSevenTest() {
        String expected = "Gotcha";
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(expected, fizzBuzz.getFizzyBuzz(220));
    }

}
