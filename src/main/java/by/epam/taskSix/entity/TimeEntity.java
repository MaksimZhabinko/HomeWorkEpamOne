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
        return "TimeEntity{" +
                "seconds=" + seconds +
                '}';
    }
}
