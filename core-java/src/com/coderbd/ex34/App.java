package com.coderbd.ex34;

/**
 * Created by J2EE-33 on 9/21/2017.
 */
public class App {
    public static void main(String... args){
        OverloadingMethod obj=new OverloadingMethod();
        System.out.println("X1-> "+obj.average(10));
        System.out.println("X1+X2-> "+obj.average(10,12));
        System.out.println("X1+x2+x3-> "+obj.average(5,7,8));

       float avg=obj.average(+1,2,3,4,5);
       System.out.println("average-> "+avg);
       ///////////////

        Statistics objj=new Statistics();
      int avgOfInt = objj.average(10,12);
      long avgLong=objj.average(10,12);

      System.out.println("Int: "+avgOfInt);
        System.out.println("Long: "+avgLong);

    }


}
