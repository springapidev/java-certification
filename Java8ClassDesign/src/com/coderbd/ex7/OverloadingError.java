package com.coderbd.ex7;

/**
 * @author Mohamamd Rajaul Islam
 */
class OverloadingError {

    public static void aMethod(byte val) {
        System.out.println("byte");
    }

    public static void aMethod(short val) {
        System.out.println("short");
    }

    public static void main(String[] args) {
        //byte b=9 // ok
        //aMethod(9);//un comment this line
    }
}
