package by.epam.taskFive.report;

import by.epam.taskFive.entity.NumberEntity;

public class NumberReport {
    public void print(NumberEntity number, boolean isPerfect) {

        System.out.println("Number "+number.getMyNumber()+" is perfect = "+isPerfect);
    }
}
