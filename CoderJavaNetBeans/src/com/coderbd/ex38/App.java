package com.coderbd.ex38;

/**
 * Created by J2EE-33 on 9/24/2017.
 */
public class App {


    public static void main(String[] args){

        System.out.println(StaticKeyword.x);
        System.out.println(StaticKeyword.area());
    }
    static {
        System.out.println("hi I am from static");
    }

}
