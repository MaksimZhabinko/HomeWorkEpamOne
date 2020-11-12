package by.epam.taskTen.service;

import by.epam.taskTen.entity.DataEntity;

import java.util.TreeMap;

public class DataService {
    public TreeMap<Double,Double> calculateFunction(DataEntity dataEntity) {
        TreeMap<Double,Double> map = new TreeMap<>();
        for (dataEntity.getA(); dataEntity.getA() <= dataEntity.getB(); dataEntity.setA(dataEntity.getA()+ dataEntity.getH())) {
            map.put(dataEntity.getA(),Math.tan(dataEntity.getA()));
        }
        return map;
    }
}

