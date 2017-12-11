/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day8.abstracts;

/**
 *
 * @author Instructor
 */
public class Dog extends Animal{

    @Override
    void bark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    void bite(){
        System.out.println("I am non abstact at abstarct class");
        
    }
    
}
