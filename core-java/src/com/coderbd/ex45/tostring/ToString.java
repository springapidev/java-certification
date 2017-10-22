package com.coderbd.ex45.tostring;

import java.util.Date;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class ToString {
   
    public static void main(String[] args) {
         Date now=new Date();
         System.out.println(now);
         System.out.println("After using toString; "+now.toString());
         ///////////
         String x="10";
         int y=Integer.parseInt(x);
         String z=Integer.toString(y);
        System.out.println("x as String: "+x); 
        System.out.println("y as int: "+y);
        System.out.println("z as String: "+z);
       
         
    }
}
