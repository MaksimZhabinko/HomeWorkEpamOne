package by.epam.taskNine.report;

import by.epam.taskNine.entity.Entity;

public class Report {
    public void print(Entity entity) {
        System.out.println( "площадь равна = " + entity.getS() + " длина равна = " + entity.getL());
    }
}
