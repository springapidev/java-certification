package com.coderbd.ex36;

/**
 * Created by J2EE-33 on 9/23/2017.
 */
public class ForLoop {
    private static int x=1;
    private static int y=10;
    private static int sum=0;

    public static int makeSum(int s, int e){
      for (int i=s; i<=e; i++ ){
          sum+=i;
      }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(makeSum(x,y));
    }

}
