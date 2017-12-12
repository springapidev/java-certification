package com.coderbd.ex11;

/**
 * @author Mohamamd Rajaul Islam
 */
public class Point {
        private int xPos, yPos;

        public Point(int x, int y) {
                xPos = x;
                yPos = y;
        }

        // override the equals method to perform 
        // "deep" comparison of two Point objects 
        public boolean equals(Point other){
                if(other == null)
                        return false;
               // two points are equal only if their x and y positions are equal 
               if( (xPos == other.xPos) && (yPos == other.yPos) )
                        return true;
                else
                        return false;
          }

        public static void main(String []args) {
                Point p1 = new Point(10, 20);
                Point p2 = new Point(50, 100);
                Point p3 = new Point(10, 20);
                System.out.println("p1 equals p2 is " + p1.equals(p2));
                System.out.println("p1 equals p3 is " + p1.equals(p3));
          }
}
