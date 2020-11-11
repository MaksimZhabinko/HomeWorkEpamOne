package by.epam.taskFive.main;

import by.epam.taskFive.entity.MyNumber;
import by.epam.taskFive.report.NumberReport;
import by.epam.taskFive.service.NumberService;

public class Main {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(28);
        NumberService service = new NumberService();
        NumberReport report = new NumberReport();
        report.print(number,service.isNumberPerfect(number));
    }
}


