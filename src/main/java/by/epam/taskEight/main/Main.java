package by.epam.taskEight.main;

import by.epam.taskEight.entity.MyNumberEntity;
import by.epam.taskEight.report.Report;
import by.epam.taskEight.service.Service;

public class Main {
    public static void main(String[] args) {
        MyNumberEntity entity = new MyNumberEntity(3);
        Service service = new Service();
        double result = service.calculateFunction(entity);
        Report report = new Report();
        report.print(result);
    }
}
