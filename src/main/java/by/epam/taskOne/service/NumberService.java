package by.epam.taskOne.service;

import by.epam.taskOne.entity.MyNumber;

public class NumberService {
    public int findTheLastSquareNumber(MyNumber myNumber) {
         return myNumber.getNumber() % 10 * myNumber.getNumber() % 10;
    }

}
