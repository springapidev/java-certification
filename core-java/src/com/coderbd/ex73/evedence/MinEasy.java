package com.coderbd.ex73.evedence;

import java.util.Arrays;

public class MinEasy {
    public static void main(String[] args) {
        int a[]={5,7,9,2,4,5};
        System.out.println("Min Number: "+getMinValue(a));
    }
    public static int getMinValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
