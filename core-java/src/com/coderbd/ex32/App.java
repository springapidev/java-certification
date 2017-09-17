package com.coderbd.ex32;

import java.util.Scanner;

/**
 * Created by J2EE-33 on 9/17/2017.
 */
public class App {
    public static void main(String [] args){
SumUsingForLoop sum=new SumUsingForLoop();

Scanner sc=new Scanner(System.in);
           System.out.println("Enter value for startingnumber");
           sum.setStartingnumber(sc.nextInt());
           System.out.println("Enter value for startingnumber");
           sum.setEndingNumber(sc.nextInt());
System.out.println(sum.getSumResult(sum.getStartingnumber(),sum.getEndingNumber()));
    }
}
