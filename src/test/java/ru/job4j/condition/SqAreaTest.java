package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int p = 4;
        int k = 1;
        int expected = 1;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP248K15Then60to0625() {
        int p = 248;
        double k = 15;
        double expected = 60.0625;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.0001);
    }

    @Test
    public void whenP488K46Then26to9515() {
        int p = 488;
        double k = 46;
        double expected = 26.9515;
        double out = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }
}
