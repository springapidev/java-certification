package com.coderbd.ex30.dog;
public class App {
     public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy", "Black", "Asian", 25000.0);
        System.out.println("Name: " + dog1.getName());
        System.out.println("Color: " + dog1.getColor());
        System.out.println("Race: " + dog1.getRace());
        System.out.println("Price: " + dog1.getPrice());

    }
  
}
