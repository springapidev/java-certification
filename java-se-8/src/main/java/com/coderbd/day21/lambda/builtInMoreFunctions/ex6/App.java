/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex6;

import java.util.function.ToDoubleFunction;

/**
 *
 * @author Rajail Islam
 */
public class App {
    public static void main(String[] args) {
    ToDoubleFunction<Integer> i  = (x)-> Math.sin(x);
    
    System.out.println(i.applyAsDouble(Integer.MAX_VALUE));
  }
}
