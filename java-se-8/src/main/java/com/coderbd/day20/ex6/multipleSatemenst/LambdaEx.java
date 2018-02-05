/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day20.ex6.multipleSatemenst;

/**
 *
 * @author Rajail Islam
 */
public class LambdaEx {

    public static void main(String[] args) {

        // You can pass multiple statements in lambda expression  
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }

}
