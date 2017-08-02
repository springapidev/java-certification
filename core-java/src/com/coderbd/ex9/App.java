package com.coderbd.ex9;

public class App {
    public static void main(String [] args){
        float x=2;
        float y=5;
        float z=x+y;

        double d=x+y;// float value can be used in double
       // int i=x+y; Incompatiable type

        //Now

        double a=2.33;
        double b=3.03;
        double c=a+b;

       // float e=a+b; Incompatiable type

        //And More........
        String g="Hi";
       // char ch=g;Incompatiable type

        //And
        char ck='A';
        // String str=ck; Incompatiable type
    }

    /**
     * Since the variables i and j are floats, resultant will be float type too.
     * So, we have to use float or primitive type which can hold float, such as double.
     * it has a wider range and also can hold floating point numbers. Hence,
     * we can use double or float for the blank.
     * long and int can’t be used with floating point numbers so double is correct.
     */
}
