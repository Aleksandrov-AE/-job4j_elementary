package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistance00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance11to22then1dot41() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance11to11then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}