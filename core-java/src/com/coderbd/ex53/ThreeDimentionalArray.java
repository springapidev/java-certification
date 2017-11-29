package com.coderbd.ex53;

public class ThreeDimentionalArray {
    public static void main(String[] args) {
        // test is a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each to itterate a  3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(" "+item);
                }
              System.out.println();
            }
            System.out.println();
        }
    }
}
