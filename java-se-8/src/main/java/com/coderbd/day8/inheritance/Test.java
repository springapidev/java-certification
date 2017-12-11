package com.coderbd.day8.inheritance;

/**
 *
 * @author Instructor
 */
public class Test {

    public static void main(String[] args) {
        B b = new B(1, "abc@gmail.com");
        System.out.println("ID: " + b.getId() + " Email: " + b.getEmail());
        System.out.println("=================");

        A a = new A(100, "Mr. A");
        System.out.println("ID: " + a.getId() + " Name: " + a.getName());
        System.out.println("=================");
        A ab = new B();
        ab.setId(200);
        ab.setName("Mr. AB");
        System.out.println("ID: " + ab.getId() + " Name: " + ab.getName());

        System.out.println("=======Method Part==========");

        b.display();
        a.display();
        ab.display();
    }
}
