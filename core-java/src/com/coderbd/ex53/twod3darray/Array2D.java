package com.coderbd.ex53.twod3darray;

/**
 *
 * @author J2EE-33
 */
public class Array2D {

    public static void main(String[] args) {
        //Here 2 indicates Row and 3 indicates column
        int[][] array2D = new int[2][3];
        //Row 1 Data
        array2D[0][0] = 1;
        array2D[0][1] = 3;
        array2D[0][2] = 5;
        //Row 2 data
        array2D[1][0] = 2;
        array2D[1][1] = 6;
        array2D[1][2] = 9;

        for (int[] array1D : array2D) {
            for (int item : array1D) {
                System.out.print(" "+item);
            }
            System.out.println("");
        }

    }

}
