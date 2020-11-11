package by.epam.taskTwo.main;

import by.epam.taskTwo.entity.YearMonthEntity;
import by.epam.taskTwo.report.Report;
import by.epam.taskTwo.service.Service;

public class Main {
    public static void main(String[] args) {
        YearMonthEntity entity = new YearMonthEntity(2020, 2);
        Service service = new Service();
        String result = service.findDay(entity);
        Report report = new Report();
        report.print(result);
    }
}
