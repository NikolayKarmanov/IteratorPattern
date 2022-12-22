package ru.netology;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Person {
    private Random random = new Random();
    private static final String[] names = {"Ivan", "Petr", "Maxim", "Mikhail", "Vadim", "Roman"};
    private static final String[] surnames = {"Ivanov", "Petrov", "Sidorov", "Abramovich"};
    private String name;
    private String surname;
    private int age;

    public Person() {
        this.name = names[random.nextInt(names.length)];
        this.surname = surnames[random.nextInt(surnames.length)];
        this.age = ThreadLocalRandom.current().nextInt(30, 40);
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " years";
    }
}
