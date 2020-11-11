package by.epam.taskNine.main;

import by.epam.taskNine.entity.Entity;
import by.epam.taskNine.report.Report;
import by.epam.taskNine.service.Service;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity(3);
        Service service = new Service();
        service.circumferenceAndAreaOfACircle(entity);
        Report report = new Report();
        report.print(entity);
    }
}
