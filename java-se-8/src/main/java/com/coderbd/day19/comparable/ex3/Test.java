/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.comparable.ex3;

import java.util.*;

class Test {

    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Munna", 23));
        al.add(new Student(106, "Zunaid", 27));
        al.add(new Student(105, "Rashidul", 21));
        al.add(new Student(107, "Emon", 22));

        System.out.println("Sorting by Name...");

        Collections.sort(al, new NameComparator());
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al, new AgeComparator());
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
