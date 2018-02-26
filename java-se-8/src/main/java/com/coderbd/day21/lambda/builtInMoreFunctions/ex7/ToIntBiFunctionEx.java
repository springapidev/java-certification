/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex7;

import java.util.function.ToIntBiFunction;

/**
 *
 * @author Rajail Islam
 */
public class ToIntBiFunctionEx {
    /*
    ToIntBiFunction represents a function that accepts two arguments and produces an int-valued result. 
    This is the int-producing primitive specialization for BiFunction. 
    */
  public static void main(String[] args) {
    ToIntBiFunction<String,String> i  = (x,y)-> Integer.parseInt(x) +Integer.parseInt(y);
   
    System.out.println(i.applyAsInt("2","3"));
  }  
}
