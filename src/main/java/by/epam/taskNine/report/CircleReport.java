package by.epam.taskNine.report;

import by.epam.taskNine.entity.Circle;

public class CircleReport {
    public void print(Circle circle) {
        System.out.println( "площадь равна = " + circle.getS() + " длина равна = " + circle.getL());
    }
}
