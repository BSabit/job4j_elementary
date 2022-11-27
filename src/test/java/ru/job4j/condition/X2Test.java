package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X2Then7() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 2;
        int expected = 7;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C2X3Then5() {
        int a = 0;
        int b = 1;
        int c = 2;
        int x = 3;
        int expected = 5;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA4B7C2X5Then137() {
        int a = 4;
        int b = 7;
        int c = 2;
        int x = 5;
        int expected = 137;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA15B78C39X124Then240351() {
        int a = 15;
        int b = 78;
        int c = 39;
        int x = 124;
        int expected = 240351;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}