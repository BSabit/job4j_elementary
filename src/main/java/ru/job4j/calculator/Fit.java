package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 170;
        short heingtWoman = 165;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heingtWoman);
        System.out.println("Man 170 in " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
