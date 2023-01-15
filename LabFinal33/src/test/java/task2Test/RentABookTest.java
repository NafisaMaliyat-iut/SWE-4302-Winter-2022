package task2Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task2.KidsBook;
import task2.NewBook;
import task2.RegularBook;
import task2.RentABook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentABookTest {
    RegularBook regularBook = new RegularBook("River flows", "John Smith");
    KidsBook kidsBook = new KidsBook("Learning ABC", "Mary Jane");
    NewBook newBook = new NewBook("Mother Teresa", "Eire Johnson");
    RentABook rentABook1;
    RentABook rentABook2;
    RentABook rentABook3;
    RentABook rentABook4;
    RentABook rentABook5;
    RentABook rentABook6;
    @BeforeEach
    void setUp() {
        rentABook1 = new RentABook(5, regularBook, 40.0);
        rentABook2 = new RentABook(10, regularBook, 40.0);
        rentABook3 = new RentABook(2, kidsBook, 10.0);
        rentABook4 = new RentABook(12, kidsBook, 10.0);
        rentABook5 = new RentABook(4, newBook, 70.0);
        rentABook6 = new RentABook(14, newBook, 70.0);
    }


    @Test
    public void RegularBookWithoutFine(){
        assertEquals(200.0, rentABook1.calculateRent());
    }

    @Test
    public void RegularBookWithFine(){
        assertEquals(292.0, rentABook2.calculateRent());
    }

    @Test
    public void KidsBookWithoutFine(){
        assertEquals(20.0, rentABook3.calculateRent());
    }

    @Test
    public void KidsBookWithFine(){
        assertEquals(90.0, rentABook4.calculateRent());
    }

    @Test
    public void NewBookWithoutFine(){
        assertEquals(280.0, rentABook5.calculateRent());
    }

    @Test
    public void NewBookWithFine(){
        assertEquals(518.0, rentABook6.calculateRent());
    }

}
