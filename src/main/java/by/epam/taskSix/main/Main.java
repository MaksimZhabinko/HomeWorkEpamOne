package by.epam.taskSix.main;

import by.epam.taskSix.entity.TimeEntity;
import by.epam.taskSix.report.TimeReport;
import by.epam.taskSix.service.TimeCalculatingService;

public class Main {
    public static void main(String[] args) {
        TimeEntity sec = new TimeEntity(3061);
        TimeCalculatingService service = new TimeCalculatingService();
        TimeReport report = new TimeReport();
        report.print(service.calculateTime(sec));
    }
}


