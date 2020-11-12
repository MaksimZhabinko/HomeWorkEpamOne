package by.epam.taskSeven.service;

import by.epam.taskSeven.entity.Point2D;

public class CoordinatesService {
    
    public final static Point2D POINTZERO = new Point2D(0, 0);

    public double calculateDistance(Point2D a, Point2D b) {
        double d = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY() * (b.getY() - a.getY())));
        return d;
    }

    public String isThePointCloser(Point2D a, Point2D b) {
        String answer;
        double aTo0 = calculateDistance(a, POINTZERO);
        double bTo0 = calculateDistance(b, POINTZERO);
        if (aTo0 > bTo0) {
            answer = "B is closer to 0 than A";
        } else if (aTo0 < bTo0) {
            answer = "A is closer to 0 than B";
        } else answer = "Distance from A to 0 = Distance from B to 0";
        return answer;
    }
}



