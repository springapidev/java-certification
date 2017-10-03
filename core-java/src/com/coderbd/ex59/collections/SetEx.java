package com.coderbd.ex59.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add("one");
        set.add("second");
        set.add("3rd");
        set.add(new Integer(4));
        set.add(new Float(5.0F));
        set.add("second");//duplicate
        set.add(new Integer(4));//duplicate

        System.out.println("set: " + set);
    }

}
