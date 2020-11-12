package by.epam.taskEight.entity;

public class NumberEntity {

    private double number;

    public NumberEntity(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberEntity{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
