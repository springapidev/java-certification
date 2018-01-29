package com.coderbd.ex15;

public class App extends X{
    public void foo() throws RuntimeException {
        super.foo();
        if (true) throw new RuntimeException();// if I remove throw new RuntimeException();, then result will be X B
        System.out.print("B ");
    }
    public static void main(String[] args) {
        new App().foo();
    }
}
