package com.coderbd.ex46.finalKeyword;

import static java.lang.Math.PI;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class FinalKeyword {

    public final double FINAL_VALIE_OF_X;

    public FinalKeyword() {
        FINAL_VALIE_OF_X = 3.14;
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        System.out.println("" + obj.FINAL_VALIE_OF_X);

    }

}
