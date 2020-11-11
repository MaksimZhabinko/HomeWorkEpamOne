package by.epam.taskSix.service;

import by.epam.taskSix.entity.TimeEntity;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TimeCalculatingServiceTest {
    @Test
    public void calculateTimeEquals() {
        TimeEntity sec = new TimeEntity(3061);
        TimeCalculatingService service = new TimeCalculatingService();
        List<Integer> condition = service.calculateTime(sec);
        List<Integer> actual = Arrays.asList(0, 51, 1);
        assertEquals(condition, actual);
    }

    @Test
    public void calculateTimeNotEquals() {
        TimeEntity sec = new TimeEntity(3061);
        TimeCalculatingService service = new TimeCalculatingService();
        List<Integer> condition = service.calculateTime(sec);
        List<Integer> actual = Arrays.asList(0, 31, 1);
        assertNotEquals(condition, actual);
    }

}
