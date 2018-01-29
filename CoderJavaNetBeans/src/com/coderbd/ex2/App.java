package com.coderbd.ex2;

public class App {



        public static void main(String[] args){
            System.out.print("Ok");
            int arr[]=new int[-2];//this line will return Exception in thread "main" java.lang.NegativeArraySizeException
            System.out.print("arr[]"+arr);
        }
}
