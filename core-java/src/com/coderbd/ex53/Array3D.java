package com.coderbd.ex53;

/**
 *
 * @author J2EE-33
 */
public class Array3D {

    public static void main(String[] args) {
        //3D Array
        int[][][] array3D = {
            {{1, 3, 5}, {2, 6, 9, 8}, {1, 1}, {8}},
            {{5, 0, 7}, {9, 8}, {1, 0, 1}, {1, 8}}
        };

        for (int[][] array2D : array3D) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.print(" " + item);
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }

}
