package ru.job4j.condition;

public class StringRunner {
    public static void maim(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But, I am a newbie. ";
        int year = 2022;
        idea = idea + year;
        System.out.println(idea);

        String idea1 = "I like Java!";
        idea1 += " But, I am a newbie. ";
        int year1 = 2022;
        idea1 += year1;
        System.out.println(idea1);
    }
}
