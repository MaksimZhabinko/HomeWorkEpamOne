package by.epam.taskNine.service;

import by.epam.taskNine.entity.Circle;

public class CircleService {

    private static final double PI = Math.PI;

    public void circumferenceAndAreaOfACircle (Circle circle) {
        circle.setS(PI * circle.getR() * circle.getR());
        circle.setL(2 * PI * circle.getR());
    }

}
