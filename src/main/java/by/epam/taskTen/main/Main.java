package by.epam.taskTen.main;

import by.epam.taskTen.entity.DataEntity;
import by.epam.taskTen.report.DataReport;
import by.epam.taskTen.service.DataService;

import java.util.TreeMap;

public class Main {

    private static final int A = 1;
    private static final int B = 10;
    private static final double H = 0.5;

    public static void main(String[] args) {
        DataEntity dataEntity = new DataEntity(A,B,H);
        DataService service = new DataService();
        TreeMap<Double,Double> result = service.calculateFunction(dataEntity);
        DataReport report = new DataReport();
        report.print(result);
    }
}


