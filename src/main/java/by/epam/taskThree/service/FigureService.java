package by.epam.taskThree.service;

import by.epam.taskThree.entity.SquareArea;

public class FigureService {
    public double findOuterSquareSide(SquareArea squareArea){
        return Math.sqrt(squareArea.getSquareArea());
    }
    public double findInnerSquareArea(double outerSquareSide){
        return outerSquareSide*outerSquareSide/2;
    }
    public double compareSquares(SquareArea squareArea,double innerSquareArea){
        return squareArea.getSquareArea()/innerSquareArea;
    }
}
