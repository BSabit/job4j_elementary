package ru.job4j.calculator;

public class Qwerty {
    public static void plus(int a, int b, int d, int e) {
        int c = a + b;
        int f = e - a + d;
        int j = f + c;
        System.out.println(f);
        System.out.println(c);
        System.out.println(j);
    }

    public static void main(String[] args) {
        int result = Calculator.onePlustwo(0, 0);
        System.out.print("Result: ");
        System.out.println(result);

    }
}
