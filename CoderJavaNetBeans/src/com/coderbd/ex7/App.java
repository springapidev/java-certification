package com.coderbd.ex7;

public class App extends Test {

    public static void main(String[] args){
    System.out.print("Ok");
    }
    final void abc(){

    }
    /**
     * abstract is incorrect as we can’t use abstract with a non-abstract method.
     * (here method has method body.)   private is incorrect as when overriding method
     * we can’t use more restrictive access modifier, so trying to use private to override
     * default access level method causes a compile time error.
     * default is incorrect as default methods (not methods with default access level)
     * are allowed only in interfaces.
     * int is incorrect as method all ready has void as return type, so we can’t add int there.
     * final is correct as we can use final there, since the method is non-abstract.
     * REFERENCE        : https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
     */
}
