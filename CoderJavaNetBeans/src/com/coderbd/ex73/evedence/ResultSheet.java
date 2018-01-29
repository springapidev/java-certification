package com.coderbd.ex73.evedence;


import java.util.*;

public class ResultSheet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Written Mark");
        int written = s.nextInt();
        System.out.println("Enter EVI Mark");
        int evi = s.nextInt();
        int total = written + evi;
        if (written >= 70 && evi >= 30) {
            if (written > 100 || evi > 50) {
                System.out.println("You can not input over 100 and 50 respectively");
            } else {
                System.out.println("Your Marks is "+total+" And You are Passed");
            }
        } else {
         System.out.println("Your Marks is "+total+" And You are Failed");
        }
    }
}
