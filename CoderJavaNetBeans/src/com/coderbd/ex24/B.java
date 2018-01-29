package com.coderbd.ex24;

class B extends A {
    void process() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B().process();
    }

}