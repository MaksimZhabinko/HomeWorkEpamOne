package by.epam.taskNine.service;

import by.epam.taskNine.entity.Entity;

public class Service {
    public static final double PI = Math.PI;
    public void circumferenceAndAreaOfACircle (Entity entity) {
        entity.setS(PI * entity.getR() * entity.getR());
        entity.setL(2 * PI * entity.getR());
    }

}
