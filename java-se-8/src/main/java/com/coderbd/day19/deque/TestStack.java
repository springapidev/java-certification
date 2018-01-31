/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day19.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Rajail Islam
 */
public class TestStack {
    public static void main(String[] args){
       Deque<String> stack = new ArrayDeque<>();
       stack.push("one");
       stack.push("two");
        stack.push("three");

        int size = stack.size() - 1;
        while (size >= 0 ) {
            System.out.println(stack.pop());
            size--;
        }        
    }
}
