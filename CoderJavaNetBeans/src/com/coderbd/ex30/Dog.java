package com.coderbd.ex30;


import com.coderbd.ex30.others.Animal;

/**
 *
 * @author J2EE-33
 * @see Class declaration
 */
public class Dog extends Animal {
    /**
 * 
 * @see Fields declaration
 */
   public String name;
   private String color;
   private double height;
   

   
   
   /**
 * 
 * @see Class Constructor declaration
 */
    public Dog() {
    }

    public Dog(String name, String color, double height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

   
/**
 * @see getters and setter
 * @return 
 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void display(){
        System.out.println("ok");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
}
