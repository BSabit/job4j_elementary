package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float ruble) {
        float rsl = ruble / 70;
        return rsl;
    }

    public static float tengeToEuro(float tenge) {
        float rsl = tenge / 477;
        return rsl;
    }

    public static float tengeToDollar(float tenge) {
        float rsl = tenge / 461;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float euroTenge1 = Converter.tengeToEuro(4770);
        float euroTenge2 = Converter.tengeToEuro(2700);
        float dollarTenge = Converter.tengeToDollar(4610);
        float dollar = Converter.tengeToDollar(1950);
        System.out.println("140 ruble are " + euro + " euro.");
        System.out.println("4770 tenge are " + euroTenge1 + " euro.");
        System.out.println("2700 tenge are " + euroTenge2 + " euro.");
        System.out.println("4610 tenge are " + dollarTenge + " dollar.");
        System.out.println("1950 tenge are " + dollar + " dollar.");
    }
}
