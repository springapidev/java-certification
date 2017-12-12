package com.coderbd.ex22;

/**
 * @author Mohamamd Rajaul Islam
 */
// Point is a mutable class 
class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
        	xPos = x;
        	yPos = y;
	}

	public String toString() { 
        	return "x = " + xPos + ", y = " + yPos; 
	}
	
	int getX() { return xPos; }
	int getY() { return yPos; }
} 

// ImmutableCircle is an immutable class � the state of its objects 
// cannot be modified once the object is created 

public final class ImmutableCircle {
	private final Point center;	
	private final int radius;
	public ImmutableCircle(int x, int y, int r) {	
		center = new Point(x, y); 
               	radius = r;
        }
	public String toString() {
		return "center: " + center + " and radius = " + radius;
	}
	public int getRadius() {
		return radius;
	}
	public Point getCenter() {
		// return a copy of the object to avoid 
		// the value of center changed from code outside the class 
		return new Point(center.getX(), center.getY()); 
	}
	public static void main(String []s) {
		System.out.println(new ImmutableCircle(10, 10, 20));
       	}	 
	// other members are elided �  
}
