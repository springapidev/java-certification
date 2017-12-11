package com.coderbd.day8.interfaces;

public class Dog implements Animal, Animal2 {

    @Override
    public void bark() {
        System.out.println("::::Bark::::");
    }

    @Override
    public void bite() {
        System.out.println("::::bite::::");
    }

    @Override
    public void eat() {
        System.out.println("::::eat::::");
    }

    @Override
    public void sleep() {
        System.out.println("::::sleep::::");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
