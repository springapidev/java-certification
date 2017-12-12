package com.coderbd.ex9;

/**
 * @author Mohamamd Rajaul Islam
 */
class Point {

    private int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public static void main(String[] args) {
        // Passing a Point object to println 
// automatically invokes the toString method 
        System.out.println(new Point(10, 20));
    }
}
