package com.coderbd.ex6;

public class App {
    public static void main(String[] args){
        int x=10;
        if (x > 10) {

            System.out.println(">");

        } else if (x < 10) {

            System.out.println("<");

        } else {

            System.out.println("=");

        }

        /**
         * Another Similiar Statement of above Code
         */
        System.out.println(x>10?">":x<10?"<":"=");
    }
    /**
     * Here, we have to use two ternary operators altogether. So, firstly, we will check the x > 10, as follows;

     x>10?”>”: (when condition true)

     Now, we have to use another to check if x<10 as follows;

     x<10?”<”: “=”

     We can combine these two by putting last ternary statement in the false position of ternary statement as follows;

     x>10?”>”: x<10?”<”: “=”
     Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
     */

    /**
     * Note: Which of followings are the features of multiple classes?
     * When your goal is code reuse, composition provides an approach that yields
     * easier-to-change code. Inheritance is a way of reusing code and building more functional
     * objects from a basic object.
     */
}
