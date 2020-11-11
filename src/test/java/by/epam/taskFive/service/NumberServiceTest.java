package by.epam.taskFive.service;

import by.epam.taskFive.entity.MyNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {
    @Test
    public void isNumberPerfectTrue() {
        MyNumber number = new MyNumber(28);
        NumberService service = new NumberService();
        boolean condition = service.isNumberPerfect(number);
        assertTrue(condition);
    }

    @Test
    public void isNumberPerfectFalse() {
        MyNumber number = new MyNumber(27);
        NumberService service = new NumberService();
        boolean condition = service.isNumberPerfect(number);
        assertFalse(condition);
    }

}
