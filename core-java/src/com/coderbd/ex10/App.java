package com.coderbd.ex10;

public class App {

    public static void main(String [] args){
        Integer n = Integer.valueOf("201.12");
    }
    /**
     * Exception in thread "main" java.lang.NumberFormatException: For input string: "201.12"
     at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
     at java.lang.Integer.parseInt(Integer.java:580)
     at java.lang.Integer.valueOf(Integer.java:766)
     at com.coderbd.ex10.App.main(App.java:6)
     */
    /**
     * he Integer class valueOf()  returns an Integer from given string.
     * But we need to pass a string which has correct format for integer otherwise,
     * it will throw a NumberFormatException.
     * In this case, we have passed a string which is not an integer value (since what we passed is a fractional number),
     * so  NumberFormatException will be thrown is correct.
     */
}
