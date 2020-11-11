package by.epam.taskNine.service;

import by.epam.taskNine.entity.Entity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {
    @Test
    public void circumferenceAndAreaOfACircleEquals() {
        Entity entity = new Entity(3);
        Service service = new Service();
        service.circumferenceAndAreaOfACircle(entity);
        Entity expected = new Entity(3, 28.274333882308138, 18.84955592153876);
        assertEquals(entity, expected);
    }

    @Test
    public void circumferenceAndAreaOfACircleNotEquals() {
        Entity entity = new Entity(3);
        Service service = new Service();
        service.circumferenceAndAreaOfACircle(entity);
        Entity expected = new Entity(3, 22.274333882308138, 18.84955592153876);
        assertNotEquals(entity, expected);
    }

}
