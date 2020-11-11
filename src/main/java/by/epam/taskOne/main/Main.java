package by.epam.taskOne.main;

import by.epam.taskOne.entity.MyNumber;
import by.epam.taskOne.report.NumberReport;
import by.epam.taskOne.service.NumberService;

public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(144);
        NumberService service = new NumberService();
        int result = service.findTheLastSquareNumber(myNumber);
        NumberReport report = new NumberReport();
        report.print(result);

    }
}
