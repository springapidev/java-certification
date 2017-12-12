package com.coderbd.ex12;

/**
 * @author Mohamamd Rajaul Islam
 */
public class Point {
        private int xPos, yPos;
        
        public Point(int x, int y) {
                xPos = x;
                yPos = y;
        }
        
        // override the equals method to perform "deep" comparison of two Point objects 
        @Override 
        public boolean equals(Object other) {
                if(other == null)
                         return false;
                
                // check if the dynamic type of 'other' is Point 
                // if 'other' is of any other type than 'Point', the two objects cannot be 
                // equal if 'other' is of type Point (or one of its derived classes), then 
                // downcast the object to Point type and then compare members for equality 
        	if(other instanceof Point) {
                	Point anotherPoint = (Point) other; 
                        // two points are equal only if their x and y positions are equal 
                	if((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
               			return true;
                }
                return false;
        }

         public static void main(String []args) {
                Object p1 = new Point(10, 20);
                Object p2 = new Point(50, 100);
                Object p3 = new Point(10, 20);
                System.out.println("p1 equals p2 is " + p1.equals(p2));
                System.out.println("p1 equals p3 is " + p1.equals(p3));
         }
}
