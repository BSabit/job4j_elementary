package ru.job4j.lesson;

public class Human {
    String name;
    Car4 car;
    BankAccount1 bA;

    void info() {
        System.out.println("Имя: " + name + ". Цвет машины: " + car.color + ". Мотор машины: " + car.engine + ". Номер ID в банке: " + bA.id + ". Баланс на счету банка: " + bA.balance + "$.");
    }

}

class HumenTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car4("black", "v8");
        h.bA = new BankAccount1(15, 500.0);
        h.info();
    }
}

class Car4 {
    Car4(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount1 {
    BankAccount1(int id1, double balance1) {
        id = id1;
        balance = balance1;
    }

    int id;
    double balance;
}