package by.epam.taskThree.service;

import by.epam.taskThree.entity.SquareArea;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureServiceTest {

    private static final int SQUARE_AREA = 16;
    private static final double EXPECTED_FOR_OUTER = 4.0;
    private static final double EXPECTED_FOR_INNER = 8.0;
    private static final double EXPECTED_FOR_COMPARE = 2.0;
    private static final double DELTA = 0.0;

    @Test
    public void findOuterSquareSide() {
        // Given
        SquareArea squareArea = new SquareArea(SQUARE_AREA);
        FigureService service = new FigureService();
        // When
        double actual = service.findOuterSquareSide(squareArea);
        // Then
        assertEquals(EXPECTED_FOR_OUTER, actual, DELTA);
    }

    @Test
    public void findInnerSquareArea() {
        // Given
        SquareArea squareArea = new SquareArea(SQUARE_AREA);
        FigureService service = new FigureService();
        // When
        double actual = service.findInnerSquareArea(service.findOuterSquareSide(squareArea));
        // Then
        assertEquals(EXPECTED_FOR_INNER, actual, DELTA);
    }

    @Test
    public void compareSquares() {
        // Given
        SquareArea squareArea = new SquareArea(SQUARE_AREA);
        FigureService service = new FigureService();
        // When
        double actual = service.compareSquares(squareArea, service.findInnerSquareArea(service.findOuterSquareSide(squareArea)));
        // Then
        assertEquals(EXPECTED_FOR_COMPARE, actual, DELTA);
    }
}
