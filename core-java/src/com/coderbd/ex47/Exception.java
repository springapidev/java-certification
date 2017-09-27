package com.coderbd.ex47;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class Exception {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is occured here");
        }

        System.out.println("Hi lazy.........");

    }

}
