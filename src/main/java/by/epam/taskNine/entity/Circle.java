package by.epam.taskNine.entity;

import java.util.Objects;

public class Circle {
    private int r;
    private double s;
    private double l;

    public Circle(int r) {
        this.r = r;
    }

    public Circle(int r, double s, double l) {
        this.r = r;
        this.s = s;
        this.l = l;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r &&
                Double.compare(circle.s, s) == 0 &&
                Double.compare(circle.l, l) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, s, l);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("r=").append(r);
        sb.append(", s=").append(s);
        sb.append(", l=").append(l);
        sb.append('}');
        return sb.toString();
    }
}
