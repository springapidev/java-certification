/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day7.methods.ex1;

/**
 *
 * @author Instructor
 */
public class App {
     public static void main(String[] args) {
        MethodEx ex = new MethodEx();
        ex.display();

        //Call method example 2
        ex.display("Hi.....", "Red");
        System.out.println("display method 2: " + ex.display("Hi.....", "Red"));
        //Call again method example 2
        String des = "ok............";
        String color = "RED";
        ex.display("Hi.....", "Red");
        System.out.println("display method 2 again: " + ex.display(des, color));
        //Call again method example 2
        System.out.println(ex.display(ex.getDescription(), ex.getColor()));
    }
}
