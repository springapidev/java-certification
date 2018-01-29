package com.coderbd.ex36;

/**
 * Created by Mohammad Rajaul Islam
 */
public class IfElseStatment {
    public static int x=15;
    public static   int y=10;


    public static void main(String[] args) {
        checkBig(x,y);
        System.out.println(checkBigReturn(x,y)+" is Big");

        IfElseStatment obj=new IfElseStatment();
        obj.checkBigNonStatic(x,y);

        System.out.println(obj.checkBigReturnNonStatic(x,y)+" is Big");
    }

//Way- 2
    public static void checkBig(int value1, int value2){
        if(value1>value2){
            System.out.println(value1+" is Big");
        }else {
            System.out.println(value2+" is Big");
        }

    }

    //Way 3
    public static int checkBigReturn(int value1, int value2){
        if(value1 > value2){
           return value1;
        }else {
          return value2;
        }

    }

    //Way- 4
    public void checkBigNonStatic(int value1, int value2){
        if(value1>value2){
            System.out.println(value1+" is Big");
        }else {
            System.out.println(value2+" is Big");
        }

    }

    //Way- 5
    public int checkBigReturnNonStatic(int value1, int value2){
        if(value1 > value2){
            return value1;
        }else {
            return value2;
        }

    }
}
