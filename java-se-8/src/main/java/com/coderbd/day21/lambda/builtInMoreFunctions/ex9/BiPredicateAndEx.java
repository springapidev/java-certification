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
public class BiPredicateAndEx {

    public static void main(String[] args) {
        /*
         BiPredicate and method returns a composed predicate that represents a short-circuiting 
        logical AND of this predicate and another.
        Syntax:
               default BiPredicate<T,U> and(BiPredicate<? super T,? super U> other)

         */
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;

        BiPredicate<Integer, Integer> eq = (x, y) -> x - 2 > y;

        System.out.println(bi.test(2, 3));
        System.out.println(bi.and(eq).test(2, 3));
        System.out.println(bi.and(eq).test(8, 3));
    }
}
