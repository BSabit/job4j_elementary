package ru.job4j.ru.job4j.calculator;

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
        Qwerty.plus(100, 85, 45, 300);
        Qwerty.plus(250, 120, 70, 500);
        Calculator.onePlustwo(100, 200);
    }
}
