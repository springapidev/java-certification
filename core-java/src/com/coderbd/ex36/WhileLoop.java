package com.coderbd.ex36;

import java.util.Scanner;

/**
 * Created by Mohammad Rajaul Islam.
 */
public class WhileLoop {

    private static int startingNum=1;
    private static int endingNum=10;
    private static int sum=0;

    public static void main(String[] args) {
        System.out.println(makeSum(startingNum,endingNum));
    }

    public static int makeSum(int x,int y){
           while(x<=y){
            sum+=x;
            x++;
        }
        return sum;
    }
}
