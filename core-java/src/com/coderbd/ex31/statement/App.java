package com.coderbd.ex31.statement;

/**
 * Created by J2EE-33 on 9/16/2017.
 */
public class App {
    public static void main(String[] args){
        Subject subject=new Subject();

        subject.setSubjectName("j2ee");
        subject.setMark(60);
        subject.setStatusPass("Pass");
        subject.setStatusFail("Fail");

        if(subject.getMark()>70){
            System.out.println(subject.getStatusPass()+" in "+subject.getSubjectName());
        }else{
            System.out.println(subject.getStatusFail()+" in "+subject.getSubjectName());
        }
    }
}
