package com.coderbd.ex36;

/**
 * Created by J2EE-33 on 9/24/2017.
 */
public class DoWhileLoop {
    private static int startingNum=1;
    private static int endingNum=10;
    private static int sum=0;

    public static void main(String[] args) {
        System.out.println(makeSum(startingNum,endingNum));
    }

    public static int makeSum(int x,int y){
        do{
          sum+=x;
          x++;
        }while(x<=y);

        return sum;
    }
}
