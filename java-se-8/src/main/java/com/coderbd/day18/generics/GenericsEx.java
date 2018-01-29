package com.coderbd.day18.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsEx {

    public static void main(String[] args) {
        //Non- Generic Example
        List list = new ArrayList();
        list.add(new String("A"));
        list.add(new String("B"));
        list.add(new Integer(10));
        list.add(new Double(5000.0));
        list.add(new Float(300.0f));
        for (Object obj : list) {
            System.out.println("Rs: " + obj);
        }
        //Generic Example
        List<String> strlist = new ArrayList();
        strlist.add(new String("A"));
        strlist.add(new String("B"));

        for (String obj : strlist) {
            System.out.println("Rs: " + obj);
        }

        List<Integer> partList = new ArrayList<>(3);
        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
        partList.add(new Integer(4444)); // ArrayList auto grows
        System.out.println("First Part: " + partList.get(0)); //
//First item
        partList.add(0, new Integer(5555)); // Insert an item by
        System.out.println("5555: in 0 index:  " + partList.get(0));

        Integer bigInt = new Integer(10);
        System.out.println("bigInt: " + bigInt);
        int smallInt = bigInt.intValue();
        int smallIn = bigInt;//auto unboxing
        System.out.println("smallInt: " + smallInt);
        Integer bigIngAgain = smallInt;//auto boxing
        System.out.println("bigIngAgain: " + bigIngAgain);

        ///////////set example
        Set<String> sets = new TreeSet<>();
        sets.add("one");
        sets.add("two");
        sets.add("three");
        sets.add("three");
        sets.add("three");
        for(String str : sets){
            System.out.println("Sets: "+str);
        }
    }

}
