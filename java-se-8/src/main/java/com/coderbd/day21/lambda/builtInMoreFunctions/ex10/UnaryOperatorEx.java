/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex10;

import java.util.function.UnaryOperator;

/**
 *
 * @author Rajail Islam
 */
public class UnaryOperatorEx {
    /*
    UnaryOperator represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function 
    for the case where the operand and result are of the same type. 
    */
  public static void main(String[] args) {
    UnaryOperator<String> i  = (x)-> x.toLowerCase();
    
    System.out.println(i.apply("java2s.COM"));
  }  
}
