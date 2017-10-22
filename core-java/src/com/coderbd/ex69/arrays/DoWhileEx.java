package com.coderbd.ex69.arrays;

/**
 *
 * @author J2EE-33
 */
public class DoWhileEx {

    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i++ > --j) {
                continue;
            }
            System.out.println("i = " + i + " and j = " + j);
        } while (i < 5);
        
    }
}
