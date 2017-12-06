package com.coderbd.day7;

/**
 *
 * @author Instructor
 */
public class NumbersEx {

    public static void main(String[] args) {
        int x = 10;
        long y = x;
        System.out.println("int to Long: " + y);
        byte p = 8;
        short q = p;
        int r = q;
        long s = r;
        System.out.println("byte->short->int->long: " + s);
        /////////////
        int m = 55555;
        long n = 66666;
        long o = m * n;
        System.out.println("int * long equal long: " + o);

        long num1 = 1234567891123456L;
        int num2 = (int) num1;
        System.out.println("num1 to num2: " + num2);
        //////compile error 
        int n1 = 55;
        int n2 = 62;
        byte n3 = (byte) (n1 + n2);
        System.out.println("n3: " + n3);

        ////float
        float a, b, c;
        a = 1.0f;
        b = 2;
        int px = 5;
        c = a + b + px;
        System.out.println("c: " + c);
//parse
        String strNum = "25";
        double num10 = Double.parseDouble(strNum);
        System.out.println("num10: " + num10);
    }

}
