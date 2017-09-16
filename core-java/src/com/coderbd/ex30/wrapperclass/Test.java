package com.coderbd.ex30.wrapperclass;

public class Test {
    private String dogName;
    
    
    
    

    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt);//this is called boxing
        int p2 = wInt.intValue();//this is called unboxing

        System.out.println("pInt-> " + pInt);
        System.out.println("wInt-> " + wInt);
        System.out.println("p2-> " + p2);

        String a = "10";
        int x = Integer.parseInt(a);
        System.out.println("x-> " + x);

        int y = Integer.valueOf(a).intValue();
        System.out.println("y-> " + y);

        long p = 120;
        int q = (int) p;

        long r = q;
        System.out.println("p-> " + p);
        System.out.println("q-> " + q);
        System.out.println("r-> " + r);
    }
}
