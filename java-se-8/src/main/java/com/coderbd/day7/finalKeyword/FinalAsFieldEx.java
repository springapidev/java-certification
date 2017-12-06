package com.coderbd.day7.finalKeyword;

/**
 *
 * @author Instructor
 */
public class FinalAsFieldEx {

    private static final long BIG_NUMBER = 10;

    public static void main(String[] args) {
        //x=15; 
        // If we make field final, 
        //then we can not change its value again
        System.out.println("BIG_NUMBER: " + BIG_NUMBER);
    }
}
