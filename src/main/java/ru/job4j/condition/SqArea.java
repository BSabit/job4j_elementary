package ru.job4j.condition;

public class SqArea {
    public static double sqarea(double p, double k) {
        double rsl = (p / (2 * (k + 1))) * (p / (2 * (k + 1)) * 1);
                return rsl;
                //Нужно было найти S(площадб) где: S=I(длина)*H(высота), i=h*k, h=p/(2*(k+1))
    }

    public static void main(String[] args) {
        double s = SqArea.sqarea(4, 1);
        System.out.println("p = 4. k = 1, s = 1, real = " + s);
    }
}
