package by.epam.taskSeven.main;


import by.epam.taskSeven.entity.Point2D;
import by.epam.taskSeven.report.Report;
import by.epam.taskSeven.service.CoordinatesService;

//7.	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y
public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D(1,1);
        Point2D b = new Point2D(1,2);
        Report report = new Report();
        CoordinatesService service = new CoordinatesService();
        report.print(service.isThePointCloser(a,b));
    }
}
