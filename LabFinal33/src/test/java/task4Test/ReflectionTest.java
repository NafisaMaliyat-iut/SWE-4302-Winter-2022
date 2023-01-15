package task4Test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionTest {

    @Test
    public void testBookSuperClass(){
    assertEquals(Object.class, task2.Book.class.getSuperclass());

    }


    @Test
    public void testCalculatorAbstraction(){
        Constructor<?>[] declaredConstructors= task3.Calculator.class.getConstructors();
        assertEquals(1, declaredConstructors.length);

        int getModifiers = task3.Calculator.class.getModifiers();
        assertFalse(Modifier.isAbstract(getModifiers));
    }
}
