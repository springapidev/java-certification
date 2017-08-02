package com.coderbd.ex3;

public class App {


    public static void main(String[] args){
        System.out.print("Ok");
        int arr[]=new int[10];
        /**
         *         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 12
         */
        System.out.print("arr[]"+arr[12]);
    }
}
