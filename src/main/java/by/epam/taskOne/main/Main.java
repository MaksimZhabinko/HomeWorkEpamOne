package by.epam.taskOne.main;

import by.epam.taskOne.entity.NumberEntity;
import by.epam.taskOne.report.NumberReport;
import by.epam.taskOne.service.NumberService;

public class Main {

    private static final int NUMBER = 144;

    public static void main(String[] args) {
        NumberEntity numberEntity = new NumberEntity(NUMBER);
        NumberService service = new NumberService();
        int result = service.findTheLastSquareNumber(numberEntity);
        NumberReport report = new NumberReport();
        report.print(result);
    }
}
