package com.coderbd.ex30.dog;

public class Dog {

    private String name;
    private String color;
    private String race;
    private double price;

    public Dog(String name, String color, String race, double price) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }

    public double getPrice() {
        return price;
    }

   
}
