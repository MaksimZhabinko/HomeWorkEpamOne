package by.epam.taskTwo.service;

import by.epam.taskTwo.entity.DateEntity;

public class DateService {
    public String findDay(DateEntity entity) {
        if (entity.getYear() % 4 != 0 || entity.getYear() % 100 == 0 && entity.getYear() % 400 != 0) {
            switch (entity.getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return "31 день";
                case 2:
                    return "28 дней";
                case 4:
                case 6:
                case 9:
                case 11:
                    return "30 дней";
            }
        } else {
            switch (entity.getMonth()) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return "31 день";
                case 2:
                    return "29 дней";
                case 4:
                case 6:
                case 9:
                case 11:
                    return "30 дней";
            }
        }
        return null;
    }
}
