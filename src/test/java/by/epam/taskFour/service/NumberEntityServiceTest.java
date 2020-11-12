package by.epam.taskFour.service;

import by.epam.taskFour.entity.NumberArray;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberEntityServiceTest {

    private static final int[] ARRAY_TRUE = {34, 55, 65, 44};
    private static final int[] ARRAY_FALSE = {33, 55, 65, 44};

    @Test
    public void isTwoEvenNumbersTrue() {
        // Given
        NumberArray array = new NumberArray(ARRAY_TRUE);
        NumberService service = new NumberService();
        // When
        boolean condition = service.isTwoEvenNumbers(array);
        // Then
        assertTrue(condition);
    }
    @Test
    public void isTwoEvenNumbersFalse() {
        // Given
        NumberArray array = new NumberArray(ARRAY_FALSE);
        NumberService service = new NumberService();
        // When
        boolean condition = service.isTwoEvenNumbers(array);
        // Then
        assertFalse(condition);
    }
}
