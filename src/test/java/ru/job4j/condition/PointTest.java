package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to24Then3() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 2;
        int y2 = 4;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to53Then1to414213() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 5;
        int y2 = 3;
        double expected = 1.414213;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.000001);
    }

    @Test
    public void when78to1522Then16to124515() {
        int x1 = 7;
        int y1 = 8;
        int x2 = 15;
        int y2 = 22;
        double expected = 16.124515;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.000001);
    }
}