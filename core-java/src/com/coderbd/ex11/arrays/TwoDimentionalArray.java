package com.coderbd.ex11.arrays;

public class TwoDimentionalArray {
    public static void main(String args[]) {
        int twoD[][] = new int[7][8];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
