package com.coderbd.ex47;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class AddArguments {

    public static void main(String[] args) {
        try {
            //nested try started
            try {
                args = new String[1];
                args[0] = "10";
                System.out.println("Index : " + args[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" ==ArrayIndexOutOfBoundsException== ");
            }
             //nested try ended
            
            System.out.println(10 / 10);
        } catch (ArithmeticException e) {
            System.out.println(" ==ArithmeticException== ");
        }finally{
            System.out.println("finally always will be executed");
        }
    }
}
