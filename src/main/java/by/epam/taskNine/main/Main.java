package by.epam.taskNine.main;

import by.epam.taskNine.entity.Circle;
import by.epam.taskNine.report.CircleReport;
import by.epam.taskNine.service.CircleService;

public class Main {

    private static final int CIRCLE = 3;

    public static void main(String[] args) {
        Circle circle = new Circle(CIRCLE);
        CircleService circleService = new CircleService();
        circleService.circumferenceAndAreaOfACircle(circle);
        CircleReport circleReport = new CircleReport();
        circleReport.print(circle);
    }
}
