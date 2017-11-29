package com.coderbd.ex53;

public class ThreeDArray {
    public static void main(String[] args) {

        // 3d array
        int[][][] array3D = {
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

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: array3D) {
            for (int[] array1D: array2D) {
                for(int element: array1D) {
                    System.out.print(" " +element);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
