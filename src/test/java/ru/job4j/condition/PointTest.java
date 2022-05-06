package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistance00to20then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double expected = 2;
        double out = p1.distance(p2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance11to22then1dot41() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        double expected = 1.41;
        double out = p1.distance(p2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance11to11then0() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        double expected = 0;
        double out = p1.distance(p2);
        assertEquals(expected, out, 0.01);
    }

}