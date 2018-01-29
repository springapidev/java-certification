package com.coderbd.ex56;

public class AnonymousInnerDemo {

    public static void main(String[] args) {
        B b = new B(){
           
            @Override
            public void displayMsg() {
                System.out.println("Hi, I am a method from class a, but Modified");
            }
        };
        
        b.displayMsg();
    }
}
