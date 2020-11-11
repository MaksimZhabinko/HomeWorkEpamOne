package by.epam.taskFive.entity;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getMyNumber() {
        return number;
    }

    public void setMyNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
