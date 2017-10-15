package com.coderbd.ex73.evedence;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting number");
        int n1 = s.nextInt();
        System.out.println("Enter Ending number");
        int n2 = s.nextInt();
        calculateSum(n1, n2);
    }

    public static void calculateSum(int sn, int en) {
        int sum = 0;
        if (sn < en) {
            for (int i = sn; i <= en; i++) {
                sum += i;
            }

        } else {
            for (int i = sn; i >= en; i--) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }

}
