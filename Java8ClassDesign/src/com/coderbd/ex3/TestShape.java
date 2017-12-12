package com.coderbd.ex3;

/**
 * @author Mohamamd Rajaul Islam
 */
class Shape {

    public double area() {
        return 0;
    } // default implementation 
    // other members 
}

class Circle extends Shape {

    private int radius;

    public Circle(int r) {
        radius = r;
    }
    // other constructors 

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    // other declarations
}

class Square extends Shape {

    private int side;

    public Square(int a) {
        side = a;
    }

    @Override
    public double area() {
        return side * side;
    }
    // other declarations
}

public class TestShape {

    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        System.out.println(shape1.area());
        Shape shape2 = new Square(10);
        System.out.println(shape2.area());
    }
}
