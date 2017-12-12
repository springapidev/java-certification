package com.coderbd.ex7;

/**
 * @author Mohamamd Rajaul Islam
 */
class AmbiguousOverload {

    public static void aMethod(long val1, int val2) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2) {
        System.out.println("int, long");
    }

    public static void main(String[] args) {
        //aMethod(9, 10);// ambigous overload occured here, uncomment this line and check
        // aMethod(9, 10L);// ambigous overload occured here
    }
}
