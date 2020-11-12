package by.epam.taskSix.service;

import by.epam.taskSix.entity.TimeEntity;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TimeCalculatingServiceTest {

    private static final int SECONDS = 3061;
    private static final List<Integer> EXPECTED = Arrays.asList(0, 51, 1);

    @Test
    public void calculateTime() {
        // Given
        TimeEntity sec = new TimeEntity(SECONDS);
        TimeCalculatingService service = new TimeCalculatingService();
        // When
        List<Integer> actual = service.calculateTime(sec);
        // Then
        assertEquals(EXPECTED, actual);
    }
}
