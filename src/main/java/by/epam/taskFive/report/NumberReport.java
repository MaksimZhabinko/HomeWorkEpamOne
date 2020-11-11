package by.epam.taskFive.report;

import by.epam.taskFive.entity.MyNumber;

public class NumberReport {
    public void print(MyNumber number, boolean isPerfect) {

        System.out.println("Number "+number.getMyNumber()+" is perfect = "+isPerfect);
    }
}
