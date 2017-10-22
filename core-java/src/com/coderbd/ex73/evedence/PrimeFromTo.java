package com.coderbd.ex73.evedence;

public class PrimeFromTo {
    
    public static void main(String[] args) {
        checkPrimeFromTo(1, 100);
    }

    public static void checkPrimeFromTo(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (checkPrime(i)) {
                System.out.println(i + " is Prime Number");
            }
        }
    }

    public static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
         //   System.out.println("Number is not prime");
            flag = 1;
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {

                    // System.out.println("Number is not prime");
                    flag = 1;
                    return false;
                    
                }
            }
        }
        if (flag == 0) {
            return true;
            // System.out.println("Number is prime");
        }
        return true;
    }
}
