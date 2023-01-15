package task3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task3.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void SetUp(){
        calculator = new Calculator();
    }

    @Test
    public void calculatorTest1(){
        assertEquals(13.0, calculator.add(6.0, 7.0));
    }

    @Test
    public void calculatorTest2(){
        assertEquals(30.0, calculator.subtract(70.0, 40.0));
    }

    @Test
    public void calculatorTest3(){
        assertEquals(28.0, calculator.multiply(7.0, 4.0));
    }

    @Test
    public void calculatorTest4(){
        assertEquals(3.0, calculator.divide(90.0, 30.0));
    }
}
