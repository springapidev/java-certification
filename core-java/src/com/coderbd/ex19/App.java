package com.coderbd.ex19;

public class App {
    public static String name;
    public static void main(String[] args) {
        new App().someMethod(name);
    }
    public void someMethod(Object value) {
         // check for null value ...
        if (value == null) {
            //It handles well
    throw new IllegalArgumentException("value is null");
         //No chance of bellow AssertionException
            //throw new AssertionException("value is null");
        }
        System.out.println(value.getClass());
         }
}
