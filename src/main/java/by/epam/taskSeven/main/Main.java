package by.epam.taskSeven.main;

import by.epam.taskSeven.entity.Point2D;
import by.epam.taskSeven.report.PointReport;
import by.epam.taskSeven.service.CoordinatesService;

public class Main {

    private static final int x1 = 1;
    private static final int x2 = 1;
    private static final int y1 = 1;
    private static final int y2 = 2;

    public static void main(String[] args) {
        Point2D a = new Point2D(x1,y1);
        Point2D b = new Point2D(x2,y2);
        CoordinatesService service = new CoordinatesService();
        String result = service.isThePointCloser(a,b);
        PointReport pointReport = new PointReport();
        pointReport.print(result);
    }
}
