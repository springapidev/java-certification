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
public class BiPredicateTestEx {
    /*
    Syntax:
boolean test(T t,  U u)

    */
  public static void main(String[] args) {
    BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
    System.out.println(bi.test(2, 3));
  }  
}
