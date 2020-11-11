package by.epam.taskEight.entity;

public class MyNumberEntity {
    private double number;

    public MyNumberEntity(double number) {
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
        return "MyNumberEntity{" +
                "number=" + number +
                '}';
    }
}
