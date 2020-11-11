package by.epam.taskThree.main;

import by.epam.taskThree.entity.SquareArea;
import by.epam.taskThree.report.FigureReport;
import by.epam.taskThree.service.FigureService;

public class Main {
    public static void main(String[] args) {
        SquareArea squareArea = new SquareArea(16);
        FigureService figureService = new FigureService();
        FigureReport report = new FigureReport();
        report.printInnerSquareArea(squareArea,figureService.findInnerSquareArea(figureService.findOuterSquareSide(squareArea)));
        report.printCompareSquares(figureService.compareSquares(squareArea,figureService.findInnerSquareArea(figureService.findOuterSquareSide(squareArea))));
    }
}
