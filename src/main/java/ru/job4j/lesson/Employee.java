package ru.job4j.lesson;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    int salaryX(int s) {
        salary *= s;
        return salary;
    }

    void info() {
        System.out.println("ID:" + id + ". Фамилия:" + surname + ". Возраст:" + age + ". Зарплата:" + salary
                + "тенге. Отделение:" + department + ".");
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 1;
        e1.surname = "Ким";
        e1.age = 27;
        e1.salary = 250_000;
        e1.department = "Администрация";

        e2.id = 2;
        e2.surname = "Батырханов";
        e2.age = 25;
        e2.salary = 300_000;
        e2.department = "Бухгалтерия";

        e1.info();
        e1.salaryX(2);
        e1.info();
        e2.info();
        e2.salaryX(2);
        e2.info();
    }
}
