/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex4.withOrWithoutReturnKeyword;

/**
 *
 * @author Rajail Islam
 */
public class LambdaEx {
   public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
    }    
}
