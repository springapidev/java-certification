package com.coderbd.day3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Instructor
 */
public class ArrayEx2{

    public static void main(String[] args) {
        //Array Index starts from 0 (zero)
        // String[] items = {"Shirt", "Pants", "Scarf"}; //Correct
        // String items = {"Shirt", "Pants", "Scarf"};//wrong
        // String items[] = {"Shirt", "Pants", "Scarf"};//Correct
        // String[] items = {"Shirt", "Pants", "Scarf"};//Correct
        String s = String.valueOf(200);
        String[] items = {"Shirt", "Pants", s};//correct 
        //String[] items = {"Shirt", "Pants", 200};//wrong 
        for (String item : items) {
            System.out.println("Items: " + item);
        }

        // Now move to another ways
        String[] itemArary = new String[3];
        System.out.println("length of itemArary: " + itemArary.length);
        itemArary[0] = "Shirt";
        itemArary[1] = "Pant";
        itemArary[2] = "Scarf";
        // itemArary[3]="Cap";// wrong, and it will produce array index out of bound exception

        for (String item : itemArary) {
            System.out.println("Items: " + item);
        }

        int[] numbers = {25, 4, 5, 8, 9};
        for (int num : numbers) {
            System.out.println("Numbers; " + num);
        }

        // Now look for two dimentional array
        int[][] twoDArray = {{25, 24, 35, 48, 66}, {15, 14, 51, 28, 9},{15, 14, 51, 28, 9}};
        for (int[] oneDArray : twoDArray) {
            for (int num : oneDArray) {
                System.out.print(" " + num);
            }
            System.out.println(" ");
        }

        //Best option instead of Array
        List numss = new ArrayList();
        numss.add(new String("Shirt"));
        numss.add(new Integer(100));

        for (Object o : numss) {
            System.out.println("List: " + o);
        }

        System.out.println("List size: " + numss.size());

        //List as specific way or generic way
        List<String> list = new ArrayList();
        list.add(new String("Shirt"));
        list.add(new String("100"));

        for (Object o : numss) {
            System.out.println("List: " + o);
        }

    }

}
