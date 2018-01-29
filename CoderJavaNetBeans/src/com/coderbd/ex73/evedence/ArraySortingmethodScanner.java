package com.coderbd.ex73.evedence;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingmethodScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2 row 3 column
        int[][] n = new int[2][3];
        System.out.println("Row 1");
        System.out.println("Enter Number");
        n[0][0] = sc.nextInt();
        System.out.println("Enter Number");
        n[0][1] = sc.nextInt();
        System.out.println("Enter Number");
        n[0][2] = sc.nextInt();

        System.out.println("Row 2");
        System.out.println("Enter Number");
        n[1][0] = sc.nextInt();
        System.out.println("Enter Number");
        n[1][1] = sc.nextInt();
        System.out.println("Enter Number");
        n[1][2] = sc.nextInt();
        System.out.println("Data Table");
        sortingArray(n);
    }

    public static void sortingArray(int[][] n) {
        for (int[] d : n) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
