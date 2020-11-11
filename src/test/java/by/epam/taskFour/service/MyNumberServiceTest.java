package by.epam.taskFour.service;

import by.epam.taskFour.entity.NumberArray;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MyNumberServiceTest {
    @Test
    public void isTwoEvenNumbersTrue() {
        NumberArray array = new NumberArray(34, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertTrue(condition);
    }
    @Test
    public void isTwoEvenNumbersFalse() {
        NumberArray array = new NumberArray(33, 55, 65, 44);
        NumberService service = new NumberService();
        boolean condition = service.isTwoEvenNumbers(array);
        assertFalse(condition);
    }

}
