/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.comparable.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Rajail Islam
 */
public class Test {

    public static void main(String args[]) {

        ArrayList al = new ArrayList();
        al.add(new Student(101, "Munna", 23));
        al.add(new Student(106, "Zunaid", 27));
        al.add(new Student(105, "Rashidul", 22));
        al.add(new Student(107, "Ramon", 22));

        System.out.println("Sorting by Name...");

        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by age...");

        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
