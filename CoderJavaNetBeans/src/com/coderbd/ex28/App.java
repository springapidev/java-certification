package com.coderbd.ex28;

public class App {
    public class Hello {
String title;
 int value;
 public Hello() {
           title += " World";
          }
 public Hello(int value) {
        this.value = value;
          title = "Hello";
        // Hello(); complie fails
   }
}
}
