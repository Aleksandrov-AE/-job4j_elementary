package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeight174Then85dot1() {
        short in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWomanWeight174Then73dot6() {
        short in = 174;
        double expected = 73.6;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}