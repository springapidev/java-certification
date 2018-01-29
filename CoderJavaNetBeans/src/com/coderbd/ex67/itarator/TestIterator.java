package com.coderbd.ex67.itarator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class TestIterator {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Urmi"));
        list.add(new Student("fahmida"));
        Iterator<Student> elements = list.iterator();
        while (elements.hasNext()) {
            System.out.println("" + elements.next().getName());

        }
    }

}
