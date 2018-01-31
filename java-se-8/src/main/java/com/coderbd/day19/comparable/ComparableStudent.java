/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.comparable;

/**
 *
 * @author Rajail Islam
 */
public class ComparableStudent implements Comparable<ComparableStudent> {

    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public ComparableStudent(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }
    // Additional code here

    @Override
    public int compareTo(ComparableStudent s) {
        if (this.gpa < s.gpa) {
            return -1;
        } else if (s.gpa < this.gpa) {
            return 1;
        }
        return 0;
    }

    /*
    -1 for placing it before in Collection
0 indicates same value already exists in Collection
+1 for placing it afterwards in Collection
    */
    /*
 @Override
    public int compareTo(ComparableStudent s) {
        int result = this.name.compareTo(s.getName());
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
     */
    @Override
    public String toString() {
        return "ComparableStudent{" + "name=" + name + ", id=" + id + ", gpa=" + gpa + '}';
    }

    public static void main(String[] args) {
        ComparableStudent com = new ComparableStudent("Munna", 100, 23);
        int rs = com.compareTo(new ComparableStudent("Rahidul", 100, 23));
        System.out.println("Rs: " + rs);
    }
}
