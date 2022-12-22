package ru.job4j.lesson;

public class Student {
    int studentID;
    String name;
    String surname;
    int cours;
    //Оценки по 5 бальной шкале
    float maths;
    float economy;
    float foreign;

    float sredArifOcenka(float maths, float economy, float foreign) {
       float result = (maths + economy + foreign) / 3;
        return result;
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        float itog1 = s1.sredArifOcenka(5, 4, 5);
        float itog2 = s2.sredArifOcenka(4, 4, 4);
        float itog3 = s3.sredArifOcenka(5, 3, 3); //Это еще один вариант. Самый удобный.

        s1.studentID = 1;
        s1.name = "Sabit";
        s1.surname = "Batyrkhanov";
        s1.cours = 3;
        s1.maths = 4;
        s1.economy = 4;
        s1.foreign = 4;

        s2.studentID = 2;
        s2.name = "Zaur";
        s2.surname = "Zakiev";
        s2.cours = 3;
        s2.maths = 5;
        s2.economy = 4;
        s2.foreign = 5;

        s3.studentID = 3;
        s3.name = "Pavel";
        s3.surname = "Pak";
        s3.cours = 3;
        s3.maths = 3;
        s3.economy = 5;
        s3.foreign = 5;

        System.out.println();

        System.out.println("Средняя арифметическая оценка студента " + s1.cours + " курса " + s1.name + " " + s1.surname + ": " + itog1);
        System.out.println("Средняя арифметическая оценка студента " + s2.cours + " курса " + s2.name + " " + s2.surname + ": " + itog2);
        System.out.println("Средняя арифметическая оценка студента " + s3.cours + " курса " + s3.name + " " + s3.surname + ": " + itog3);

        System.out.println();

        System.out.println("Номер студенческого билета: " + s1.studentID);
        System.out.println("Имя: " + s1.name);
        System.out.println("Фамилия: " + s1.surname);
        System.out.println("Год обучения: " + s1.cours);
        System.out.println("Средняя оценка по математике: " + s1.maths);
        System.out.println("Средняя оценка по экономике: " + s1.economy);
        System.out.println("Средняя оценка по иностранному языку: " + s1.foreign);

        System.out.println();

        System.out.println("Номер студенческого билета: " + s2.studentID);
        System.out.println("Имя: " + s2.name);
        System.out.println("Фамилия: " + s2.surname);
        System.out.println("Год обучения: " + s2.cours);
        System.out.println("Средняя оценка по математике: " + s2.maths);
        System.out.println("Средняя оценка по экономике: " + s2.economy);
        System.out.println("Средняя оценка по иностранному языку: " + s2.foreign);

        System.out.println();

        System.out.println("Номер студенческого билета: " + s3.studentID);
        System.out.println("Имя: " + s3.name);
        System.out.println("Фамилия: " + s3.surname);
        System.out.println("Год обучения: " + s3.cours);
        System.out.println("Средняя оценка по математике: " + s3.maths);
        System.out.println("Средняя оценка по экономике: " + s3.economy);
        System.out.println("Средняя оценка по иностранному языку: " + s3.foreign);

        //Альтернатива
        System.out.println();
        System.out.println("Средняя арифметическая оценка студента " + s1.cours + " курса " + s1.name + " " + s1.surname + ": "
                + (s1.maths + s1.economy + s1.foreign) / 3);
        System.out.println("Средняя арифметическая оценка студента " + s2.cours + " курса " + s2.name + " " + s2.surname + ": "
                + (s2.maths + s2.economy + s2.foreign) / 3);
        System.out.println("Средняя арифметическая оценка студента " + s3.cours + " курса " + s3.name + " " + s3.surname + ": "
                + (s3.maths + s3.economy + s3.foreign) / 3);

    }
}
