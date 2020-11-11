package by.epam.taskTwo.service;

import by.epam.taskTwo.entity.YearMonthEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    @Test
    public void findDayEquals() {
        YearMonthEntity entity = new YearMonthEntity(2020, 2);
        Service service = new Service();
        String condition = service.findDay(entity);
        assertEquals(condition, "29 дней");
    }

    @Test
    public void findDayNotEquals() {
        YearMonthEntity entity = new YearMonthEntity(2020, 2);
        Service service = new Service();
        String condition = service.findDay(entity);
        assertNotEquals(condition, "28 дней");
    }
}
