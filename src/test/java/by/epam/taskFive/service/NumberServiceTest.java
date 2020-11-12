package by.epam.taskFive.service;

import by.epam.taskFive.entity.NumberEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private static final int NUMBER_TRUE = 28;
    private static final int NUMBER_FALSE = 27;

    @Test
    public void isNumberPerfectTrue() {
        // Given
        NumberEntity number = new NumberEntity(NUMBER_TRUE);
        NumberService service = new NumberService();
        // When
        boolean condition = service.isNumberPerfect(number);
        // Then
        assertTrue(condition);
    }

    @Test
    public void isNumberPerfectFalse() {
        // Given
        NumberEntity number = new NumberEntity(NUMBER_FALSE);
        NumberService service = new NumberService();
        // When
        boolean condition = service.isNumberPerfect(number);
        // Then
        assertFalse(condition);
    }
}
