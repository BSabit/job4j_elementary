package ru.job4j.condition;

public class SqArea {
    public static double sqarea(double p, double k) {
        double rsl = (p / (2 * (k + 1))) * 1 * (p / (2 * (k + 1)));
                return rsl;
                //Нужно было найти S(площадб) где: S=I(длина)*H(высота), i=h*k, h=p/(2*(k+1))
    }

    public static void main(String[] args) {
        double s = SqArea.sqarea(4, 1);
        double s1 = SqArea.sqarea(248, 15);
        double s2 = SqArea.sqarea(488, 46);
        System.out.println("p = 4. k = 1, s = 1, real = " + s);
        System.out.println("p = 248. k = 15, real = " + s1);
        System.out.println("p = 488. k = 46, real = " + s2);
    }
}
