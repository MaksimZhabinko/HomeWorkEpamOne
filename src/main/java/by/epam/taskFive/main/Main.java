package by.epam.taskFive.main;

import by.epam.taskFive.entity.NumberEntity;
import by.epam.taskFive.report.NumberReport;
import by.epam.taskFive.service.NumberService;

public class Main {

    private static final int NUMBER = 28;

    public static void main(String[] args) {
        NumberEntity number = new NumberEntity(NUMBER);
        NumberService service = new NumberService();
        boolean isPerfect = service.isNumberPerfect(number);
        NumberReport report = new NumberReport();
        report.print(number, isPerfect);
    }
}


