package by.epam.taskSeven.service;

import by.epam.taskSeven.entity.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesServiceTest {

    private static final int x1 = 1;
    private static final int x2 = 1;
    private static final int y1 = 1;
    private static final int y2 = 2;
    private static final String EXPECTED = "A is closer to 0 than B";

    @Test
    public void isThePointCloser() {
        // Given
        Point2D a = new Point2D(x1,y1);
        Point2D b = new Point2D(x2,y2);
        CoordinatesService service = new CoordinatesService();
        // When
        String actual = service.isThePointCloser(a, b);
        // Then
        assertEquals(EXPECTED, actual);
    }
}
