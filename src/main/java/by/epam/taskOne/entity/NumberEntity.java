package by.epam.taskOne.entity;

public class NumberEntity {
    private int number;

    public NumberEntity(int number) {
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
        final StringBuilder sb = new StringBuilder("NumberEntity{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
