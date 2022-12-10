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

    public static float euroToTenge(float euro) {
        float rsl = euro * 477;
        return rsl;
    }

    public static float dollarToTenge(float dollar) {
        float rsl = dollar * 461;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float tengeEuro1 = Converter.tengeToEuro(4770);
        float tengeEuro2 = Converter.tengeToEuro(2700);
        float tengeDollar = Converter.tengeToDollar(4610);
        float dollar = Converter.tengeToDollar(1950);
        float euroTenge = Converter.euroToTenge(15);
        float dollarTenge = Converter.dollarToTenge(27);
        System.out.println("140 ruble are " + euro + " euro.");
        System.out.println("4770 tenge are " + tengeEuro1 + " euro.");
        System.out.println("2700 tenge are " + tengeEuro2 + " euro.");
        System.out.println("4610 tenge are " + tengeDollar + " dollar.");
        System.out.println("1950 tenge are " + dollar + " dollar.");
        System.out.println("15 euro are " + euroTenge + " tenge.");
        System.out.println("27 dollar are " + dollarTenge + " tenge.");

        //Тестирование
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result: " + passed);

        float prihod = 4770;
        float result = 10;
        float formula = Converter.tengeToEuro(prihod);
        boolean test = result == formula;
        System.out.println("4770 tenge are 10 euro. Test result: " + test);

        float prihod1 = 4610;
        float result1 = 10;
        float formula1 = Converter.tengeToDollar(prihod1);
        boolean test1 = result1 == formula1;
        System.out.println("4610 tenge are 10 dollar. Test result: " + test1);
    }
}
