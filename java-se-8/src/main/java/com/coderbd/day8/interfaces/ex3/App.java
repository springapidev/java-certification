package com.coderbd.day8.interfaces.ex3;

/**
 *
 * @author Instructor
 */
public class App {
    private static Animal animals;

    public App(Animal animals ) {
        this.animals=new Dog();
    }

    

    
    
    
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        Animal animal=new Dog();
        animal.bark();
        animals.bark();
    }
}
