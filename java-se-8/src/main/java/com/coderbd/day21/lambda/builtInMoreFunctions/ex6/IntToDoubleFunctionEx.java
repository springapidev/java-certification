/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex6;

import java.util.function.IntToDoubleFunction;

/**
 *
 * @author Rajaul Islam
 */
public class IntToDoubleFunctionEx {
    /*
    java.util.function.IntToDoubleFunction is a functional interface whose functional method is double
    applyAsDouble(int a). The IntToDoubleFunction interface represents an operation 
    that takes a single argument of int type and returns a result of double type.

The following example shows how to use the applyAsDouble() method of the IntToDoubleFunction 
    interface with lambda expression.
    */
    static int $x=10;
    public static void main(String[] args) {
        System.out.println("$x: "+$x);
		IntToDoubleFunction function = (a) -> (a / 3d);

		System.out.println(function.applyAsDouble(9));
		System.out.println(function.applyAsDouble(22));
	}
}
