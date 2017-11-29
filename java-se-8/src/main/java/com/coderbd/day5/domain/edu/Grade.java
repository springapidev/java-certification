package com.coderbd.day5.domain.edu;

/**
 *
 * @author Instructor
 */
public class Grade {
    
    //step-2 field declaration
    private int id;
    private double cgpa;
//step-3 default constructor

    public Grade() {
    }

    //step-4 Argumentative constructor
    public Grade(int id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
    }
//step-5 getter methods

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    
}
