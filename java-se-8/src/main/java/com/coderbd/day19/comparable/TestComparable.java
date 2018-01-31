/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.comparable;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Rajail Islam
 */
public class TestComparable {

    public static void main(String[] args) {
        Set<ComparableStudent> studentList = new TreeSet<>();
        studentList.add(new ComparableStudent("Thomas Jefferson", 1111, 3.8));
        studentList.add(new ComparableStudent("AJohn Adams", 2222, 3.9));
        studentList.add(new ComparableStudent("George Washington", 3333, 3.4));
        for (ComparableStudent student : studentList) {
            System.out.println(student);
        }
    }
}
