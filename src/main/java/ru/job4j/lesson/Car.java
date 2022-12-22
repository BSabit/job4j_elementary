package ru.job4j.lesson;

import javax.imageio.stream.ImageInputStreamImpl;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(); //Мы создали 2 одинаковы объекта(С одинаковыми базовыми характеристиками). 2 объекта, 2 адреса, одинаковые характеристики;
    }

 class CarTest2 {
        Car car3 = new Car();
        Car car4 = car3; // Мы создали 1 объект, и 2 переменные с одним и тем же адресом.

    }
}