/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.Set;

/**
 *
 * @author Rajail Islam
 */
public class Employee {

    private int id;
    private String name;
    private Set<Exam> exam;

    public Employee() {
    }

    public Employee(int id, String name, Set<Exam> exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Exam> getExam() {
        return exam;
    }

}
