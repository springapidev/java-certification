package com.coderbd.ex36;

/**
 * Created by J2EE-33 on 9/24/2017.
 */
public class ForInForBigNumber {
    private static int nums[]={4,8,5,7,36};
private static int bignumber=0;
    public static void main(String[] args) {

        for (int x : nums){
            if(x>bignumber){
                bignumber = x;
            }

        }
        System.out.println(bignumber);
    }
}
