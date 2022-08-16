package com.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean marred;
    static long Population;

    public Human(int age, String name, int salary, boolean marred) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marred = marred;
        Human.Population+=1;
    }
}
