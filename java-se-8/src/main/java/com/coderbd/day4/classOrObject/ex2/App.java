package com.coderbd.day4.classOrObject.ex2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Mr. A", "a@gmail.com");
        Person p2 = new Person(2, "Mr. B", "b@gmail.com");
        // Now make a list of Object Person
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(new Person(3, "Mr. C", "c@gmail.com"));

        for (Person p : persons) {
            System.out.println("ID: " + p.getId() + " Name: "
                    + p.getName() + " Email: " + p.getEmail());
        }

    }

}
