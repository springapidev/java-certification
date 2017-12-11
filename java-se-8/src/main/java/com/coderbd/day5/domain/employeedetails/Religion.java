/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.employeedetails;

/**
 *
 * @author rupok
 */
public class Religion {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Religion(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Religion() {
    }

}
