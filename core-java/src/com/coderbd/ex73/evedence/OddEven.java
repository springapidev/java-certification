package com.coderbd.ex73.evedence;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        checkOddEven(n);
    }

    public static void checkOddEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even Number");
        } else {
            System.out.println(n + " is Odd Number");
        }
    }
}
