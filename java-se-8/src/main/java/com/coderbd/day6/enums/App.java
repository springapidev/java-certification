package com.coderbd.day6.enums;

/**
 *
 * @author Instructor
 */
public class App {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Mr A.", Gender.MALE);
        Person p2 = new Person(2, "Mrs B.", Gender.FEMALE);
        System.out.println("Id: " + p1.getId()
                + " Name: " + p1.getName()
                + " Gender: " + p1.getGender());
        System.out.println("Id: " + p2.getId()
                + " Name: " + p2.getName()
                + " Gender: " + p2.getGender());
    }

}
