package com.coderbd.ex35;

/**
 * Created by Mohammad Rajaul Islam
 */
public class PassTest {
    public static void changeInt(int value){
        value=55;
        System.out.println(value);
    }
    public static int changeIntx(int value){
       return value;
    }

    public static void main(String[] args) {
        int val;
        val=11;
        changeInt(val);

        int a= changeIntx(val);
        System.out.println("Int Value of a is-> "+a);
        System.out.println("Int Value is-> "+val);
    }
}
