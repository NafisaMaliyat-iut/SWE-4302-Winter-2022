package Lab06Test.Task02Test;

import Lab06.Task02.Algorithm;
import Lab06.Task02.DivisibleBy3;
import Lab06.Task02.LengthGreaterThan4;
import Lab06.Task02.OddNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AlgorithmTest {

    @Test
    public void DivisibleBy3Test(){
        Algorithm algorithm = new Algorithm();
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(5);
        intList.add(6);

        DivisibleBy3 divisibleBy3 = new DivisibleBy3();
        assertEquals(2, algorithm.countIf(intList, divisibleBy3));

    }

    @Test
    public void OddTest(){
        Algorithm algorithm = new Algorithm();
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(16);
        intList.add(6);

        OddNumber oddNumber = new OddNumber();
        assertEquals(1, algorithm.countIf(intList, oddNumber));

    }

    @Test
    public void LengthGreaterThan4(){
        Algorithm algorithm = new Algorithm();
        List<String> stringList = new ArrayList<>();
        stringList.add("Alice");
        stringList.add("Bob");
        stringList.add("Beautiful");


        LengthGreaterThan4 lengthGreaterThan4 = new LengthGreaterThan4();
        assertEquals(2, algorithm.countIf(stringList, lengthGreaterThan4));

    }
}