package by.epam.taskOne.service;

import by.epam.taskOne.entity.NumberEntity;

public class NumberService {
    public int findTheLastSquareNumber(NumberEntity numberEntity) {
         return numberEntity.getNumber() % 10 * numberEntity.getNumber() % 10;
    }
}
