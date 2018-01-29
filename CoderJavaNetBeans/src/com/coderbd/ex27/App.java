package com.coderbd.ex27;

public class App {
    public static void main(String[] args) {
       String myProp = System.getProperties().getProperty("prop.custom");
       //System.getProperty("prop.custom"); /* insert code here */
            System.out.println(myProp);
     }
}
