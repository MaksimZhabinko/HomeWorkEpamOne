package by.epam.taskTen.service;

import by.epam.taskTen.entity.DataEntity;
import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class DataServiceTest {

    private static final int A = 1;
    private static final int B = 10;
    private static final double H = 0.5;
    private static final TreeMap<Double, Double> EXPECTED = fillTree();
    private static TreeMap<Double, Double> fillTree() {
        TreeMap<Double, Double> map = new TreeMap<>();
        map.put(1.0, 1.5574077246549023);
        map.put(1.5, 14.101419947171719);
        map.put(2.0, -2.185039863261519);
        map.put(2.5, -0.7470222972386603);
        map.put(3.0, -0.1425465430742778);
        map.put(3.5, 0.3745856401585947);
        map.put(4.0, 1.1578212823495775);
        map.put(4.5, 4.637332054551185);
        map.put(5.0, -3.380515006246586);
        map.put(5.5, -0.995584052213885);
        map.put(6.0, -0.29100619138474915);
        map.put(6.5, 0.22027720034589682);
        map.put(7.0, 0.8714479827243188);
        map.put(7.5, 2.706013866772691);
        map.put(8.0, -6.799711455220379);
        map.put(8.5, -1.326364327785607);
        map.put(9.0, -0.45231565944180985);
        map.put(9.5, 0.07536423875739406);
        map.put(10.0, 0.6483608274590866);
        return map;
    }

    @Test
    public void calculateFunction(){
        // Given
        DataEntity dataEntity = new DataEntity(1,10,0.5);
        DataService service = new DataService();
        // When
        TreeMap<Double,Double> actual = service.calculateFunction(dataEntity);
        // Then
        assertEquals(EXPECTED, actual);
    }
}
