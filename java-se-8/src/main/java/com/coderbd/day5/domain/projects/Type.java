package com.coderbd.day5.domain.projects;

/**
 *
 * @author Instructor
 */
public class Type {

    //step-2 field declaration
    private int id;
    private String name;
//step-3 default constructor

    public Type() {
    }

    //step-4 Argumentative constructor
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }
//step-5 getter methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
