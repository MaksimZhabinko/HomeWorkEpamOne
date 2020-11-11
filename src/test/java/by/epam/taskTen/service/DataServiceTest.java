package by.epam.taskTen.service;

import by.epam.taskTen.entity.Data;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class DataServiceTest {

    @Test
    public void calculateFunctionEquals(){
        Data data = new Data(1,10,0.5);
        DataService service = new DataService();
        TreeMap<Double,Double> condition = service.calculateFunction(data);
        TreeMap<Double, Double> actual = new TreeMap<>();
        actual.put(1.0, 1.5574077246549023);
        actual.put(1.5, 14.101419947171719);
        actual.put(2.0, -2.185039863261519);
        actual.put(2.5, -0.7470222972386603);
        actual.put(3.0, -0.1425465430742778);
        actual.put(3.5, 0.3745856401585947);
        actual.put(4.0, 1.1578212823495775);
        actual.put(4.5, 4.637332054551185);
        actual.put(5.0, -3.380515006246586);
        actual.put(5.5, -0.995584052213885);
        actual.put(6.0, -0.29100619138474915);
        actual.put(6.5, 0.22027720034589682);
        actual.put(7.0, 0.8714479827243188);
        actual.put(7.5, 2.706013866772691);
        actual.put(8.0, -6.799711455220379);
        actual.put(8.5, -1.326364327785607);
        actual.put(9.0, -0.45231565944180985);
        actual.put(9.5, 0.07536423875739406);
        actual.put(10.0, 0.6483608274590866);

        assertEquals(condition, actual);
    }

    @Test
    public void calculateFunctionNotEquals(){
        Data data = new Data(1,10,0.5);
        DataService service = new DataService();
        TreeMap<Double,Double> condition = service.calculateFunction(data);
        TreeMap<Double, Double> actual = new TreeMap<>();
        actual.put(1.0, 1.5574077246549023);
        actual.put(1.5, 14.101419947171719);
        actual.put(2.0, -2.185039863261519);
        actual.put(2.5, -0.7470222972386603);
        actual.put(3.0, -0.1425465430742778);
        actual.put(3.5, 0.3745856401585947);
        actual.put(4.0, 1.1578212823495775);
        actual.put(4.5, 4.637332054551185);
        actual.put(5.0, -3.380515006246586);
        actual.put(5.5, -0.995584052213885);
        actual.put(6.0, -0.29100619138474915);
        actual.put(6.5, 0.22027720034589682);
        actual.put(7.0, 0.8714479827243188);
        actual.put(7.5, 2.706013866772691);
        actual.put(8.0, -6.799711455220379);
        actual.put(8.5, -1.326364327785607);
        actual.put(9.0, -0.45231565944180985);
        actual.put(9.5, 0.07536423875739406);
        actual.put(10.0, 0.648360827459866);

        assertNotEquals(condition, actual);
    }
}
