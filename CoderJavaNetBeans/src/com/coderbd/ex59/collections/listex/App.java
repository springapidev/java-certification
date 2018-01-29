package com.coderbd.ex59.collections.listex;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Urmi", Gender.FEMALE, new Country(101, "Bd"), 25000.0);
        Person p2 = new Person(2, "Fahmida", Gender.FEMALE, new Country(102, "USA"), 65000.0);
        Person p3 = new Person(3, "Shabib", Gender.MALE, new Country(101, "Bd"), 26000.0);
        Person p4 = new Person(4, "Zakir", Gender.MALE, new Country(101, "Bd"), 24000.0);
        Person p5 = new Person(5, "Firoza", Gender.FEMALE, new Country(101, "Bd"), 25000.0);
        Person p6 = new Person(6, "Rumi", Gender.FEMALE, new Country(102, "USA"), 65000.0);
        Person p7 = new Person(7, "Shabib", Gender.MALE, new Country(101, "Bd"), 26000.0);
        Person p8 = new Person(8, "Zakir", Gender.MALE, new Country(101, "Bd"), 24000.0);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
        System.out.println("Size: " + personList.size());
        System.out.println("ID " + " Name" + "  Gender" + "  Country" + "" + "  Salary");
        for (Person p : personList) {
            if (p.getGender() == Gender.FEMALE && p.getCountry().getCountryName() == "USA") {
                System.out.println("" + p.getId()
                        + " " + p.getName()
                        + " " + p.getGender()
                        + "  " + p.getCountry().getCountryName()
                        + "  " + p.getSalary());
            }
        }

    }

}
