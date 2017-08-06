package com.coderbd.ex11.arrays;

import java.awt.*;

public class AppPoint extends Point {
    public static void main(String[] args){

        System.out.println(new AppPoint().createArray());

    }

    public Point[] createArray(){
        Point[] points=new Point[10];
        for (int i=0; i<points.length; i++){
            points[i]=new Point(i, i+1);
            System.out.println(i+" -> "+i++);
        }
        return points;
    }
}
