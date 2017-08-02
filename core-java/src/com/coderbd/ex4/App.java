package com.coderbd.ex4;

public class App {
    public static void main(String[] args) {
        int sum = 0;

        for(int x = 0;x<=10;x++)
            sum += x;
        //System.out.print("Sum for 0 to " + x);
        System.out.println(" = " + sum);
    }

    /**
     * The scope of loop variables remains within the loop only.
     * So, in this case, the scope of the loop variable x declared at line 7, limited to that for loop.
     * The code is trying to access that variable in line 9, which is out of the scope of the variable x,
     * causes a compile time error. So, compilation fails due to the error at line 7.
     */
    /**
     * But if we remove line 9, code will be executed successfully and Result is = 55
     */
}
