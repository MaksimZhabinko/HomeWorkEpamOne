package by.epam.taskSeven.service;

import by.epam.taskSeven.entity.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesServiceTest {
    @Test
    public void isThePointCloserEquals() {
        Point2D a = new Point2D(1,1);
        Point2D b = new Point2D(1,2);
        CoordinatesService service = new CoordinatesService();
        String condition = service.isThePointCloser(a, b);
        assertEquals(condition, "A is closer to 0 than B");
    }

    @Test
    public void isThePointCloserNotEquals() {
        Point2D a = new Point2D(1,1);
        Point2D b = new Point2D(1,3);
        CoordinatesService service = new CoordinatesService();
        String condition = service.isThePointCloser(a, b);
        assertEquals(condition, "A is closer to 0 than B");
    }

}
