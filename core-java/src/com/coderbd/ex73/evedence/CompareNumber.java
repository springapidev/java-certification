package com.coderbd.ex73.evedence;

import java.util.Scanner;

public class CompareNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number");
        int n1 = s.nextInt();
        System.out.println("Enter Second number");
        int n2 = s.nextInt();
        compareNumbers(n1, n2);
    }

    public static void compareNumbers(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is Big");

        } else {
            System.out.println(n2 + " is Big");
        }
    }

}
