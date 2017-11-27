package com.coderbd.day3;

/**
 *
 * @author Instructor
 */
public class ArrayEx4 {

    public static void main(String[] args) {
        // Now look for two dimentional array
        
        int[][][] threeDArray={{{25,24,35,48,66},{15,14,51,28,9}},{{25,24,35,48,66},{15,14,51,28,9}}};
        for(int[][] twoDArray : threeDArray){
        for(int oneDArray[] : twoDArray){
            for(int num : oneDArray){
                        System.out.print(" "+num);
            
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        }
    }

}
