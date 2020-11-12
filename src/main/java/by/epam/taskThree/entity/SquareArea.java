package by.epam.taskThree.entity;

public class SquareArea {
    private double squareArea;

    public SquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SquareArea{");
        sb.append("squareArea=").append(squareArea);
        sb.append('}');
        return sb.toString();
    }
}
