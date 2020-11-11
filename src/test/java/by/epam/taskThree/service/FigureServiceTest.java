package by.epam.taskThree.service;

import by.epam.taskThree.entity.SquareArea;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureServiceTest {
    @Test
    public void findOuterSquareSideEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findOuterSquareSide(squareArea);
        assertEquals(condition, 4.0, 0.0);
    }

    @Test
    public void findOuterSquareSideNotEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findOuterSquareSide(squareArea);
        assertNotEquals(condition, 3.0, 0.0);
    }

    @Test
    public void findInnerSquareAreaEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findInnerSquareArea(service.findOuterSquareSide(squareArea));
        assertEquals(condition, 8.0, 0.0);
    }

    @Test
    public void findInnerSquareAreaNotEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.findInnerSquareArea(service.findOuterSquareSide(squareArea));
        assertNotEquals(condition, 7.0, 0.0);
    }

    @Test
    public void compareSquaresEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.compareSquares(squareArea, service.findInnerSquareArea(service.findOuterSquareSide(squareArea)));
        assertEquals(condition, 2.0, 0.0);
    }

    @Test
    public void compareSquaresNotEquals() {
        SquareArea squareArea = new SquareArea(16);
        FigureService service = new FigureService();
        double condition = service.compareSquares(squareArea, service.findInnerSquareArea(service.findOuterSquareSide(squareArea)));
        assertNotEquals(condition, 1.0, 0.0);
    }
}
