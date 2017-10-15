package com.coderbd.ex73.evedence;

import java.util.*;

public class StudentGradeSystem {
 static String grade="";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Written Mark");
        int written = s.nextInt();
        System.out.println("Enter EVI Mark");
        int evi = s.nextInt();
        int totalMarks = written + evi;      

        if (written >= 70 && evi >= 30) {
            if (written > 100 || evi > 50) {
                System.out.println("You can input over 100 and 50 respectively ");
            } else {
                if (totalMarks >= 140 && totalMarks <= 150) {
                    grade = "A+";
                } else if (totalMarks >= 130 && totalMarks <= 139) {
                    grade = "A";
                } else if (totalMarks >= 120 && totalMarks <= 129) {
                    grade = "B+";
                } else if (totalMarks >= 100 && totalMarks <= 119) {
                    grade = "B";
                }
                System.out.println("Your Marks is " + totalMarks + " And You are Passed and Grade Is: " + grade);
            }
        } else {
            grade = "F";
            System.out.println("Your Marks is " + totalMarks + " And You are Failed and Grade Is: " + grade);
        }
    }
}
