package ru.job4j.ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int age = 21;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        age = age + 4;
        int onePlusAge = one + age;
        System.out.println(onePlusAge);
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
        onePlustwo(10, 11);
    }

    public static void onePlustwo(int one, int two) {
        int res;
        res = one + two;
        System.out.println(res);
    }
}
