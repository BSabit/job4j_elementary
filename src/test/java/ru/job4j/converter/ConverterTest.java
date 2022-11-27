package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConverter140RubleThen2euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        System.out.printf("%.150f%n", expected);
        System.out.printf("%.150f%n", out);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void tengeToEuro() {
        float in = 4770;
        float expected = 10;
        float out = Converter.tengeToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void tengeToDollar() {
        float in = 4610;
        float expected = 10;
        float out = Converter.tengeToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void euroToTenge() {
        float in = 15;
        float expected = 7155;
        float out = Converter.euroToTenge(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void dollarToTenge() {
        float in = 27;
        float expected = 12447;
        float out = Converter.dollarToTenge(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}