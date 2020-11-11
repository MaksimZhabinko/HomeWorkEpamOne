package by.epam.taskOne.entity;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyNumberEntity{" +
                "number=" + number +
                '}';
    }
}
