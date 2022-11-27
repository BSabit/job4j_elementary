package ru.job4j.calculator;

import ru.job4j.math.MathFunction;
//import static ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) { //Так делается без директивы "import"
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double sumandMultiply(double first, double second) { //Так делается с директивой "import" без модификатора "static"
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return MathFunction.subtract(first, second)
                + MathFunction.divide(first, second);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.subtract(first, second)
                + MathFunction.divide(first, second);
    }

   // public static double sumAndMultiply(double first, double second) { //Так делается с директивой "import" и с модификаторам "static"
       // return sum(first, second)
             //   + multiply(first, second);

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumandMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractAndDivide(10, 20));
       // System.out.println("Результат расчета равен: " + sumAndmultiply(10, 20));
    }
}
