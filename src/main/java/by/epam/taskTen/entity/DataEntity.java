package by.epam.taskTen.entity;

public class DataEntity {
    private double a;
    private double b;
    private double h;

    public DataEntity(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataEntity{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", h=").append(h);
        sb.append('}');
        return sb.toString();
    }
}
