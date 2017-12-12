package com.coderbd.ex1;

/**
 * @author Mohamamd Rajaul Islam
 */
class Circles {

    void getArea() {
        Circle circle = new Circle();
        // call to public method area() within package:
        circle.area();
// calling fillColor() with default access within package:
        circle.fillColor();
    }
}
