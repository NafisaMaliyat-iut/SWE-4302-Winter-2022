package Lab06Test.Task01Test;

import Lab06.Task01.GenericMaxStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericMaxStackTest {

    @Test
    public void IntegerMaxStackTest1(){
        GenericMaxStack genericMaxStack = new GenericMaxStack();
        genericMaxStack.Push(3);
        genericMaxStack.Push(5);
        genericMaxStack.Push(2);

        assertEquals(5, genericMaxStack.getMax());

    }

    @Test
    public void IntegerMaxStackTest2(){
        GenericMaxStack genericMaxStack = new GenericMaxStack();
        genericMaxStack.Push(2);
        genericMaxStack.Push(1);
        genericMaxStack.Push(2);
        genericMaxStack.Push(5);
        genericMaxStack.Pop();

        assertEquals(2, genericMaxStack.getMax());

        genericMaxStack.Pop();
        assertEquals(2, genericMaxStack.getMax());
    }


    @Test
    public void DoubleMaxStackTest1(){
        GenericMaxStack genericMaxStack = new GenericMaxStack();
        genericMaxStack.Push(49.75);
        genericMaxStack.Push(23.54);
        genericMaxStack.Push(100.0);

        assertEquals(100.0, genericMaxStack.getMax());

        genericMaxStack.Pop();

        assertEquals(49.75, genericMaxStack.getMax());
    }

    @Test
    public void StringMaxStackTest1(){
        GenericMaxStack genericMaxStack = new GenericMaxStack();
        genericMaxStack.Push("OOC is bad");
        genericMaxStack.Push("Nothing to understand");
        genericMaxStack.Push("Try hard");

        assertEquals("Try hard", genericMaxStack.getMax());

        genericMaxStack.Pop();

        assertEquals("OOC is bad", genericMaxStack.getMax());
    }
}
