package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int exepted = 120;
        int out = Factorial.calc(in);
        Assert.assertEquals(exepted, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int exepted = 1;
        int out = Factorial.calc(in);
        Assert.assertEquals(exepted, out);
    }
}