package com.coderbd.ex1;

/**
 * @author Mohamamd Rajaul Islam
 */
class Canvas {

    void getArea() {
        Circle circle = new Circle();
        circle.area(); 	// call to public method area(), outside package
    }
}
