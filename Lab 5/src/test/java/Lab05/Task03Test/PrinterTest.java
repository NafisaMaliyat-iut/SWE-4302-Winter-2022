package Lab05.Task03Test;
import Lab05.Task03.Faculty;
import Lab05.Task03.Printer;
import Lab05.Task03.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrinterTest {
    @Test
    public void printListTest(){
        Printer printer = new Printer();
        printer.AddToList(new Student("Nafisa","Dhaka",21,133));
        printer.AddToList(new Student("Sadia","Faridpur",18,107));
        printer.AddToList(new Student("Fairooz","Rajshahi",15,109));
        printer.AddToList(new Student("Rittika","Dhaka",20,108));

        printer.AddToList(new Faculty("Hridoy","Dhaka",45,"Lecturer"));
        printer.AddToList(new Faculty("Gita","Khulna",71,"Professor"));
        printer.AddToList(new Faculty("Jisa","Sylhet",32,"Assistant Professor"));
        printer.AddToList(new Faculty("Niloy","Barisal",66,"Professor"));


        String expected = "Nafisa Dhaka 21 133\n" +
                "Sadia Faridpur 18 107\n" +
                "Fairooz Rajshahi 15 109\n" +
                "Rittika Dhaka 20 108\n" +
                "Hridoy Dhaka 45 Lecturer\n" +
                "Gita Khulna 71 Professor\n" +
                "Jisa Sylhet 32 Assistant Professor\n" +
                "Niloy Barisal 66 Professor\n";

        assertEquals(expected, printer.printList());
    }
}
