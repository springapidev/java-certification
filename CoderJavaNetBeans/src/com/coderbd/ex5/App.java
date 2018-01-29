package com.coderbd.ex5;

public class App {
    public static void main(String[] args){
        try{
            Double number = Double.valueOf("120D");
            System.out.println(number);
        }catch(NumberFormatException ex){
            System.out.println(ex);
        }
      //  System.out.println(number);
    }
    /**
     * At line 6, we have created a wrapper object of the double by passing 120D,
     * which is convertible to a Double. So, there won’t be any exception.
     * But if you check carefully, you can see that variable number is declared inside try block;
     * so, the scope of the variable number is limited to that block only,
     * so trying to access it outside causes a compile time error.
     * So Compilation fails due to an error at line 10.
     */
    /**
     * But if we remove line 11, then code will be executed successfully and result is 120.0
     */
}
