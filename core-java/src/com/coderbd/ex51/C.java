package com.coderbd.ex51;
/**
 *
 * @author J2EE-33
 */
/**
 * Class can extends and implements
 * Class can not extends more than one class at a time.
 * Class can only inherit one class
 * Class can extends and implements at a time 
 * Interface can only extends , but can extends multiple interfaces.
 * Interface can never implements another interface.
 * Interface can not instantiate or can not create Object.
 * @author Mohammad Rajaul Islam
 */
public class C extends B implements A{
    public static void main(String[] args) {
    //    A a=new A(); wrong
        B a=new C();
    }
}
