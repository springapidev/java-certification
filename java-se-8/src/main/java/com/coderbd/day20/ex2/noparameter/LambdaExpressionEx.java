/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex2.noparameter;

/**
 *
 * @author Rajail Islam
 */
public class LambdaExpressionEx {
// A lambda expression can have zero or any number of arguments.
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
