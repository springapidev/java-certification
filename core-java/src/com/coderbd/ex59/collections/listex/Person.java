package com.coderbd.ex59.collections.listex;

public class Person {

    private long id;
    private String name;
    private Gender gender;
    private Country country;
    private double salary;

    public Person(long id, String name, Gender gender, Country country, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }

}
