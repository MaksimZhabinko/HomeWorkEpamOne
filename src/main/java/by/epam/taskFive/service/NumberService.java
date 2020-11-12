package by.epam.taskFive.service;

import by.epam.taskFive.entity.NumberEntity;

public class NumberService {
    public boolean isNumberPerfect(NumberEntity num) {
        int sum = 1;
        for (int i = 2;i < num.getMyNumber();i++){
            if (num.getMyNumber() % i == 0){
                sum += i;
            }
        }
        return sum == num.getMyNumber();
    }
}
