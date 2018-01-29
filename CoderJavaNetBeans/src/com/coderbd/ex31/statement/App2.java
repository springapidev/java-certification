package com.coderbd.ex31.statement;

/**
 * Created by J2EE-33 on 9/16/2017.
 */
public class App2 {
    public static void main(String[] args){
        Subject2 sub=new Subject2();
        sub.setSubjectName("Math");
        sub.setMark(69);
        sub.setStatusPass("passed");
        sub.setStatusFail("Failed");
        if(sub.getMark()>70){
          System.out.print(sub.getStatusPass()+" in "+sub.getSubjectName());
        }else {
            System.out.print(sub.getStatusFail()+" in "+sub.getSubjectName());
        }

    }
}
