package by.epam.taskTwo.service;

import by.epam.taskTwo.entity.DateEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateServiceTest {

    private static final int YEAR = 2020;
    private static final int MONTH = 2;
    private static final String EXPECTED = "29 дней";

    @Test
    public void findDay() {
        // Given
        DateEntity entity = new DateEntity(YEAR, MONTH);
        DateService dateService = new DateService();
        // When
        String actual = dateService.findDay(entity);
        // Then
        assertEquals(EXPECTED, actual);
    }
}
