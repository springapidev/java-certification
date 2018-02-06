/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex9;

import java.util.function.BiPredicate;

/**
 *
 * @author Rajail Islam
 */
public class BiPredicateOrEx {
    /*
    default BiPredicate<T,U> or(BiPredicate<? super T,? super U> other)
    */
   public static void main(String[] args) {
    BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
    
    BiPredicate<Integer, Integer> eq = (x, y) -> x -2 > y;
    
    System.out.println(bi.test(2, 3));
    System.out.println(bi.or(eq).test(2, 3));
    System.out.println(bi.or(eq).test(8, 3));
  } 
}
