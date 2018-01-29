package com.coderbd.ex66.exceptionthrows;
/**
 *
 * @author J2EE-33
 */
/**
 *
 * The 'throws' clause in java programming language is belongs to a method to
 * specify that the method raises particular type of exception while being
 * executed. The 'throws' clause takes arguments as a list of the objects of
 * type 'Throwables' class. Anybody calling a method with a throws clause is
 * needed to be enclosed within the try catch blocks.
 *
 * @author J2EE-33
 */
public class TestThrows {

    public static void main(String a[]) {
        TestThrows mytc = new TestThrows();
        try {
            for (int i = 0; i < 10; i++) {
                mytc.getSomething();
                System.out.println(i);
            }
        } catch (InterruptedException iex) {
            iex.printStackTrace();
        }
    }

    public void getSomething() throws InterruptedException {
        Thread.sleep(1000);
    }
}
