package by.epam.taskFive.service;

import by.epam.taskFive.entity.MyNumber;

public class NumberService {
    public boolean isNumberPerfect(MyNumber num) {
        int sum = 1;
        for (int i = 2;i < num.getMyNumber();i++){
            if (num.getMyNumber() % i == 0){
                sum += i;
            }
        }
        return sum == num.getMyNumber();
    }
}
