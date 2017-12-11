package com.coderbd.day8.scanner;

import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class ScannerEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for num1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number for num2: ");
        int n2 = sc.nextInt();
        int sumResult = getSum(n1, n2);
        System.out.println("sumResult : " + sumResult);
    }

    public static int getSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
