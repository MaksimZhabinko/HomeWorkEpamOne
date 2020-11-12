package by.epam.taskOne.service;

import by.epam.taskOne.entity.NumberEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private static final int NUMBER = 144;
    private static final int EXPECTED = 6;

    @Test
    public void findTheLastSquareNumber() {
        // Given
        NumberEntity numberEntity = new NumberEntity(NUMBER);
        NumberService service = new NumberService();
        // When
        int actual = service.findTheLastSquareNumber(numberEntity);
        // Then
        assertEquals(EXPECTED, actual);
    }
}
