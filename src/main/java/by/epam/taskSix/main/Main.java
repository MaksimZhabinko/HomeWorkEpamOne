package by.epam.taskSix.main;

import by.epam.taskSix.entity.TimeEntity;
import by.epam.taskSix.report.TimeReport;
import by.epam.taskSix.service.TimeCalculatingService;

import java.util.ArrayList;

public class Main {

    private static final int SECONDS = 3061;

    public static void main(String[] args) {
        TimeEntity sec = new TimeEntity(SECONDS);
        TimeCalculatingService service = new TimeCalculatingService();
        ArrayList<Integer> result = service.calculateTime(sec);
        TimeReport report = new TimeReport();
        report.print(result);
    }
}


