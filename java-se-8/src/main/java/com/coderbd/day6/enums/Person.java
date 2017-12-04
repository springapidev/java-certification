package com.coderbd.day6.enums;
/**
 *
 * @author Instructor
 */
public class Person {
    private int id;
    private String name;
    private Gender gender;

    public Person(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
    
    
    
}
