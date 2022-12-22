package ru.job4j.lesson;
                                          //Урок ССЫЛОЧНЫХ типов данных
import javax.xml.transform.SourceLocator;

public class BankAccount { //Все классы являются конструкторами. Т.е. "BankAccount" является конструктором
    int id;
    String name;
    double balance;

    double popolnenieScheta(double p) {
        balance += p;
        return balance;
    }

    double snyatieSoScheta(double s) {
        balance -= s;
        return balance;
    }

    void info() {
        System.out.println("id: " + id + ". Имя: " + name + ". Баланс на счете: " + balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();   //Это ссылочные типы данных. BankAccount- это тип данных. myAccount- это ссылка на объект. new BankAccount();- это обьект.
        BankAccount yourAccount = new BankAccount();  //Т.е. new BankAccount() - это мы создали объект
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Sabit";
        myAccount.balance = 12.50;

        yourAccount.id = 2;
        yourAccount.name = "Ivan";
        yourAccount.balance = 2.0;

        hisAccount.id = 3;
        hisAccount.name = "Zaur";
        hisAccount.balance = 30.0;

        myAccount.info();
        myAccount.popolnenieScheta(50);
        myAccount.info();
        myAccount.snyatieSoScheta(62.50);
        myAccount.info();
        yourAccount.info();
        yourAccount.popolnenieScheta(100);
        yourAccount.info();
        yourAccount.snyatieSoScheta(102.0);
        yourAccount.info();
        hisAccount.info();
        hisAccount.popolnenieScheta(250);
        hisAccount.info();
        hisAccount.snyatieSoScheta(280);
        hisAccount.info();
    }
}
