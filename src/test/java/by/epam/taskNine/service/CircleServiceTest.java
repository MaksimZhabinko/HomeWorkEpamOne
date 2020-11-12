package by.epam.taskNine.service;

import by.epam.taskNine.entity.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {

    private static final int CIRCLE = 3;
    private static final Circle EXPECTED = new Circle(3, 28.274333882308138, 18.84955592153876);

    @Test
    public void circumferenceAndAreaOfACircle() {
        // Given
        Circle circle = new Circle(CIRCLE);
        CircleService circleService = new CircleService();
        // When
        circleService.circumferenceAndAreaOfACircle(circle);
        // Then
        assertEquals(EXPECTED, circle);
    }
}
