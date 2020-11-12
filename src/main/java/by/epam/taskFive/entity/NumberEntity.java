package by.epam.taskFive.entity;

public class NumberEntity {
    private int number;

    public NumberEntity(int number) {
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
        final StringBuilder sb = new StringBuilder("NumberEntity{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
