package ru.job4j.lesson;

public class Cikly {
    public static void main(String[] args) {
        //Циклы "for", "while", "do while"
//        for (float i = 100; i >= 5; i /= 2) {
//            System.out.println("Element: " + i);
//             }

//        int i = 100;
//        while (i > 5) {
//            System.out.println("Element: " + i);
//            i -= 25;
//        }
//        int i = 10;
//        do {
//           System.out.println("Element: " + i);
//           i *= 2;
//        }
//        while (i <= 10000);

        // ОПЕРАТОРЫ В ЦИКЛАХ "break", continue"
        for (int i = 5; i <= 25; i += 2) {
            if (i % 3 == 0) {
                continue; // Оператор "continue" позволяет пропустить одну итерацию или один круг цикла. В условиях мы указали, если остаток при делении на 3 будет равен 0, то эту итерацию мы пропускаем.
            }

            if (i >= 17) {
                break;   //Если на нужно выйте из цикла на цифре 17, то для этого мы используем оператор "break". Т.е если оператор "continue" пропускает один цикл и работает дальше, то "break" останавливает цикл полностью.
            }
            System.out.println("Element: " + i);
        }
    }
}