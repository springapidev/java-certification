/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.day8.interfaces;

/**
 *
 * @author Instructor
 */
public class Test {
private static Animal animal;

    public Test(Animal animal) {
        this.animal = animal;
    }


        
    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark();
        Animal a = new Dog();
        a.bark();
       animal.bark();
        
    }
}
