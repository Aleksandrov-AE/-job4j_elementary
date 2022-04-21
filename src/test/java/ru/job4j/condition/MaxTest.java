package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenL2R2max2() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }

    @Test
    public void whenL1R22max22() {
        int left = 1;
        int right = 22;
        int expected = 22;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }

    @Test
    public void whenL44R43max44() {
        int left = 44;
        int right = 43;
        int expected = 44;
        int out = Max.max(left, right);
        assertEquals(expected, out);
    }
}