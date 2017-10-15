package com.coderbd.ex73.evedence;

import java.util.Scanner;

public class FactorialEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        checkFactorial(n);
        System.out.println("Facortorial of "+n+" is: "+checkFactorial(n));
    }
    
    public static int checkFactorial(int n) {
        int result;
        if (n == 0 || n == 1) {
            return 1;
        }
        result = checkFactorial(n - 1) * n;
        return result;
    }

}
