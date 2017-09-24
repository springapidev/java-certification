package com.coderbd.ex39;

/**
 * Created by Moahmmad Rajaul Islam
 */
public class ArrayBasic {
    private int[] x={4,5,6};
    private static int y[];

    public static void main(String[] args) {
       y=new int[5];
      y[0]=5;
      y[1]=4;
      y[2]=5;
        System.out.println(y.length);
        for (int i : y){
            System.out.println(i);
        }

    }
}
