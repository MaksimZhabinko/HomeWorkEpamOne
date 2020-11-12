package by.epam.taskEight.service;

import by.epam.taskEight.entity.NumberEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    private static final int NUMBER_IF = 2;
    private static final int NUMBER_ELSE = 3;
    private static final double EXPECTED_IF = 0.5;
    private static final double EXPECTED_ELSE = 27.0;
    private static final double DELTA = 0.0;

    @Test
    public void calculateFunctionIf() {
        // Given
        NumberEntity entity = new NumberEntity(NUMBER_IF);
        NumberService numberService = new NumberService();
        // When
        double actual = numberService.calculateFunction(entity);
        // Then
        assertEquals(EXPECTED_IF, actual, DELTA);
    }

    @Test
    public void calculateFunctionElse() {
        // Given
        NumberEntity entity = new NumberEntity(NUMBER_ELSE);
        NumberService numberService = new NumberService();
        // When
        double actual = numberService.calculateFunction(entity);
        // Then
        assertEquals(EXPECTED_ELSE, actual, DELTA);
    }
}
