package by.epam.taskSix.entity;

public class TimeEntity {

    private int seconds;

    public TimeEntity(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TimeEntity{");
        sb.append("seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
