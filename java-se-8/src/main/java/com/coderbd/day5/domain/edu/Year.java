/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day5.domain.edu;

/**
 *
 * @author Instructor
 */
public class Year {
    private int id;

    public Year() {
    }
    private int year;

    public Year(int id, int year) {
        this.id = id;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }
    
}
