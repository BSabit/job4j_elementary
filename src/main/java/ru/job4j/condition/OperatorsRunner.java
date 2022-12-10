package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        int result = first + second;
        System.out.println("Result sun: " + result);
        result = second - first;
        System.out.println(("Result subtract: " + result));
        result = first * second;
        System.out.println("Result multiply: " + result);
        result = second / first;
        System.out.println("Result divide: " + result);

        //Теперь разберем такой математический оператор, как остаток от деления – он обозначается знаком процента.
        //
        //Остаток от деления – это особый оператор, который позволяет разделить левое число в выражении на правое и получить остаток от этого деления. Если эти числа делятся друг на друга без остатка, то остаток от деления равен 0.
        //
        //Разберем несколько примеров:
        System.out.println("Remainder after division: " + second % first);
        second = 7;
        System.out.println("Remainder after division: " + second % first);
        second = 55;
        first = 15;
        System.out.println("Remainder after division: " + second % first);
        //Остальной код в WORD-де.
    }
}