/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day21.lambda.builtInMoreFunctions.ex8;

import java.util.function.DoubleFunction;

/**
 *
 * @author Rajail Islam
 */
public class DoubleFunctionEx {

    public static void main(String[] args) {
        DoubleFunction<String> function = (d) -> {
            return "Input value is " + (d+d);
        };

        System.out.println(function.apply(4.5));
        System.out.println(function.apply(15.5));
    }
}
