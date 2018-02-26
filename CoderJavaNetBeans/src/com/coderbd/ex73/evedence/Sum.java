package com.coderbd.ex73.evedence;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
    /*    Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting number");
        int n1 = s.nextInt();
        System.out.println("Enter Ending number");
        int n2 = s.nextInt();*/
        calculateSum(1L, 10000000000L);
    }

    public static void calculateSum(long snL, long enL) {
        long sum = 0L;
        if (snL < enL) {
            for (long i = snL; i <= enL; i++) {
                sum += i;
            }

        } else {
            for (long i = snL; i >= enL; i--) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }

}
