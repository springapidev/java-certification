package com.coderbd.ex73.evedence;

import java.util.Arrays;

public class MaxEasy {
    public static void main(String[] args) {
        int a[]={5,7,9,2,4,5};
        System.out.println("Max Number: "+getMaxValue(a));
    }
    public static int getMaxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
