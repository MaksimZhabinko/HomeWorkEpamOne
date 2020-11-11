package by.epam.taskEight.service;

import by.epam.taskEight.entity.MyNumberEntity;

public class Service {
    public double calculateFunction(MyNumberEntity entity) {
        double z;
        if (entity.getNumber() >= 3) {
            z = Math.pow(-entity.getNumber(), 2) + 3 * entity.getNumber() + 9;
        } else {
            z = 1 / (entity.getNumber() * entity.getNumber() * entity.getNumber() - 6);
        }
        return z;
    }

}
