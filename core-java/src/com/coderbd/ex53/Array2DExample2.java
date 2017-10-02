package com.coderbd.ex53;
/**
 *
 * @author J2EE-33
 */
public class Array2DExample2 {
    public static void main(String[] args) {
       
        int[][] array2D = {{1,3,5},{2,6,9,8},{1,1},{8}};
        
        for (int[] array1D : array2D) {
            for (int item : array1D) {
                System.out.print(" "+item);
            }
            System.out.println("");
        }

    }
  
}
