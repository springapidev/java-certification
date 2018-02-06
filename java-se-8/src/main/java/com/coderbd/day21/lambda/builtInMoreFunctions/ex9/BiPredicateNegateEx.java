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
public class BiPredicateNegateEx {

    /*
     BiPredicate negate returns a predicate that represents the logical negation of this predicate.
    Syntax: 
default BiPredicate<T,U> negate()

     */
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;

        System.out.println(bi.test(2, 3));
        System.out.println(bi.negate().test(2, 3));

    }
}
