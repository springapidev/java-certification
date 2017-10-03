package com.coderbd.ex59.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0F));
        list.add("second");//duplicate
        list.add(new Integer(4));//duplicate

        System.out.println("list: " + list);
    }
}
