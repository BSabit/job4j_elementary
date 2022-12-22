package ru.job4j.lesson;

public class Test {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int a = 5;
        int b = 8;
        int s1 = a-- - --a + ++a + a++ + a;
        int s2 = ++b - b++ + ++b - --b;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
