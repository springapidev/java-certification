package com.coderbd.ex44;

public class TestEquals {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(14, 3, 1976);
        MyDate date2 = new MyDate(14, 3, 1976);
        System.out.println("date1-> " + date1);
        System.out.println("date2-> " + date2);
        System.out.println("");
        if (date1 == date1) {
            System.out.println("date1 is identical to date2");
        } else {
            System.out.println("date1 is not identical to date2");
        }

        if (date1.equals(date2)) {
            System.out.println("date1 is equal to date2");
        } else {
            System.out.println("date1 is not equal to date2");
        }

        System.out.println("set date2 = date1;");
        date2 = date1;

        if (date1 == date2) {
            System.out.println("date1 is identical to date2");
        } else {
            System.out.println("date1 is not identical to date2");
        }

        /////////////////////////////
        int x = 10;
        int y = 10;

        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is not equal to y");
        }

        //////////////////
        String p = "hello";
        String q = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(p == q); // false
        System.out.println(p.equals(q)); // true

        ///////// 
        String m = "hello";
        String n = "he" + "llo";
        System.out.println(m == n); // true!
        System.out.println(m.equals(n)); // true!
    }
}
