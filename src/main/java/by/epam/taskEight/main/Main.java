package by.epam.taskEight.main;

import by.epam.taskEight.entity.NumberEntity;
import by.epam.taskEight.report.NumberReport;
import by.epam.taskEight.service.NumberService;

public class Main {

    private static final int NUMBER = 3;

    public static void main(String[] args) {
        NumberEntity entity = new NumberEntity(NUMBER);
        NumberService numberService = new NumberService();
        double result = numberService.calculateFunction(entity);
        NumberReport numberReport = new NumberReport();
        numberReport.print(result);
    }
}
