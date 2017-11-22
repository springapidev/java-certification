/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day3;

/**
 *
 * @author Instructor
 */
public class QuizEx {

    public static void main(String[] args) {
        String name = "Bob";
        String msg;
        int num = 3;

        msg = name + " wrote " + num + " Java programs.";
        System.out.println("Result: " + msg);
        msg = name + " wrote " + 3 + " Java programs.";
        System.out.println("Result: " + msg);
        msg = "Bob wrote " + (2 + 1) + " Java programs.";
        System.out.println("Result: " + msg);
        msg = name + " wrote " + 2 + 1 + " Java programs.";
        System.out.println("Result: " + msg);
    }
}
