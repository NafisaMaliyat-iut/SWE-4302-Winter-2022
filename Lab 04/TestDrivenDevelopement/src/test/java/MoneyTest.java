import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MoneyTest {
    @Test
    public void testMultiplicationDollar(){
        Money five = new Dollar(5);
        Money product = five.times(4);
        assertEquals(20, product.getAmount());
    }

    @Test
    public void testEqualityDollar(){
        assertEquals(new Dollar(10), new Dollar(10));
        assertTrue(new Dollar(10).equals(new Dollar(10)));
        assertFalse(new Dollar(10).equals(new Dollar(15)));
    }


    @Test
    public void testMultiplicationFranc(){
        Franc five = new Franc(5);
        Money product = five.times(4);
        assertEquals(20, product.amount);
    }

    @Test
    public void testEqualityFranc(){
        assertEquals(new Franc(10), new Franc(10));
        assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(15)));
    }
}
