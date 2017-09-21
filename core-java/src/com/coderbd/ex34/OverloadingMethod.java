package com.coderbd.ex34;

/**
 * Created by J2EE-33 on 9/21/2017.
 */
public class OverloadingMethod {
   //same name, but more than one method
    // Parameter/Argument must be different
    //return type may be different
    public float average(int x1){

        return x1;
    }

    public float average(int x1, int x2){

        return x1+x2;
    }

    public float average(int x1, int x2, int x3){

        return x1+x2+x3;
    }


    public float average(int... nums){
        int sum=0;
        for(int x : nums){
            sum+=x;
        }
      return ((float)sum)/nums.length;
    }

private int x;

    public int getIntValue(int x){

        return this.x;
    }


}
