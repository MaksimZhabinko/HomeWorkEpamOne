package by.epam.taskTwo.main;

import by.epam.taskTwo.entity.DateEntity;
import by.epam.taskTwo.report.DateReport;
import by.epam.taskTwo.service.DateService;

public class Main {

    private static final int YEAR = 2020;
    private static final int MONTH = 2;

    public static void main(String[] args) {
        DateEntity entity = new DateEntity(YEAR, MONTH);
        DateService dateService = new DateService();
        String result = dateService.findDay(entity);
        DateReport dateReport = new DateReport();
        dateReport.print(result);
    }
}
