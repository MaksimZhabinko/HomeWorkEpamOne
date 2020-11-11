package by.epam.taskOne.service;

import by.epam.taskOne.entity.MyNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {
    @Test
    public void findTheLastSquareNumberEquals() {
        MyNumber myNumber = new MyNumber(144);
        NumberService service = new NumberService();
        int condition = service.findTheLastSquareNumber(myNumber);
        assertEquals(condition, 6);
    }

    @Test
    public void findTheLastSquareNumberNotEquals() {
        MyNumber myNumber = new MyNumber(144);
        NumberService service = new NumberService();
        int condition = service.findTheLastSquareNumber(myNumber);
        assertNotEquals(condition, 7);
    }
}
