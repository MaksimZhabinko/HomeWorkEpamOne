package by.epam.taskThree.main;

import by.epam.taskThree.entity.SquareArea;
import by.epam.taskThree.report.FigureReport;
import by.epam.taskThree.service.FigureService;

public class Main {

    private static final int SQUARE_AREA = 16;

    public static void main(String[] args) {
        SquareArea squareArea = new SquareArea(SQUARE_AREA);
        FigureService service = new FigureService();
        FigureReport report = new FigureReport();
        double outerSquareSide = service.findOuterSquareSide(squareArea);
        double innerSquareArea = service.findInnerSquareArea(outerSquareSide);
        report.printInnerSquareArea(squareArea, innerSquareArea);
        double compareSquares = service.compareSquares(squareArea, innerSquareArea);
        report.printCompareSquares(compareSquares);
    }
}
