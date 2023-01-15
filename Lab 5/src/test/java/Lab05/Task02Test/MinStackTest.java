package Lab05.Task02Test;

import Lab05.Task02.MinStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    void MinStackTest1(){
        int expected = 1;

        MinStack minStack = new MinStack();
        minStack.Push(3);
        minStack.Push(2);
        minStack.Push(5);
        minStack.Push(1);

        assertEquals(expected, minStack.min());
    }


    @Test
    void MinStackTest2(){
        int expected = 2;

        MinStack minStack = new MinStack();
        minStack.Push(3);
        minStack.Push(2);
        minStack.Push(5);
        minStack.Push(1);
        minStack.Pop();
        assertEquals(expected, minStack.min());
    }

    @Test
    void MinStackTest3(){
        int expected = 3;

        MinStack minStack = new MinStack();
        minStack.Push(12);
        minStack.Push(3);
        minStack.Push(4);

        assertEquals(expected, minStack.min());
    }
}
