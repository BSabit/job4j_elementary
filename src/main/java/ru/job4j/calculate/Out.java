package ru.job4j.calculate;

public class Out {
    public static void main(String[] args) {
        String lyrics = "Мама мыла рану";
        System.out.println(lyrics);
        String name = "Sabit";
        String surname = " Batyrkhanov";
        String id = name + surname;
        System.out.println(id);
        String namE = "Сабит";
        String surName = "Батырханов";
        String separate = " ";
        String idd = namE + separate + surName;
        System.out.println(idd);
        String naME = "Petr";
        byte age = 33;
        String separatE = " - ";
        String iddd = naME + separatE + age + " yers old";
        System.out.println(iddd);
        String nAME = "Petr - ";
        byte agE = 33;
        String separaTE = " yers old";
        String iD = nAME + agE + separaTE;
        System.out.println(iD);
        String dossier = "Petr - 33 yers old";
        System.out.println(dossier);
        int first = 1;
        int second = 2;
        int onePlusTwo = first + second;
        System.out.println("1 + 2 = " + onePlusTwo);
        String label = "I ";
        label = label + "like ";
        label += "java!";
        System.out.println(label);
    }
}
