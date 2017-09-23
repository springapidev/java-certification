package com.coderbd.ex35;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by J2EE-33 on 9/23/2017.
 */
public class App {
    public static void main(String[] args) {
        MyDate obj=new MyDate(25,9,2017);
        obj.addDays(5);
       // System.out.println(obj.toString());
       System.out.println(obj.addDays(5));
    }
}
