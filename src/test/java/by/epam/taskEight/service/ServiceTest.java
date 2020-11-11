package by.epam.taskEight.service;

import by.epam.taskEight.entity.MyNumberEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    @Test
    public void calculateFunctionIf() {
        MyNumberEntity entity = new MyNumberEntity(2);
        Service service = new Service();
        double condition = service.calculateFunction(entity);
        assertEquals(condition, 0.5, 0.0);
    }

    @Test
    public void calculateFunctionElse() {
        MyNumberEntity entity = new MyNumberEntity(3);
        Service service = new Service();
        double condition = service.calculateFunction(entity);
        assertEquals(condition, 27.0, 0.0);
    }
}
