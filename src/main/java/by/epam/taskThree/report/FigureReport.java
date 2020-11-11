package by.epam.taskThree.report;

import by.epam.taskThree.entity.SquareArea;

public class FigureReport {
    public void printInnerSquareArea(SquareArea squareArea, double innerSquareArea){
        System.out.println("Внутренняя площадь = " + innerSquareArea);
    }
    public void printCompareSquares(double number){
        System.out.println("Внутренний квадрат меньше внешнего квадрата в " + number + " раза");
    }
}
