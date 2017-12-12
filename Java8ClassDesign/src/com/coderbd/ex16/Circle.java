/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

// Point is an independent class and here we are using it with Circle class 
class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public String toString() {
		return "(" + xPos + "," + yPos + ")"; 
	}
}

// Circle.java
public class Circle {
	private Point center;	// Circle “contains” a Point object 
	private int radius;
	public Circle(int x, int y, int r) {	
		center = new Point(x, y); 
               	radius = r;
        }
	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}

	public static void main(String []s) {
		System.out.println(new Circle(10, 10, 20));
       	}	 
	// other members (constructors, area method, etc) are elided …  
}
