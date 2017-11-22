package com.coderbd.day3;

/**
 *
 * @author Instructor
 */
public class ArrayEx3 {

    public static void main(String[] args) {
        int scoresArray[] = {2, 7, 9, 12, 15, 20, 2, 6, 45};
        getResult(scoresArray);
    }

    public static void getResult(int[] scores) {
        boolean passed = false;
        int passMark = 12;
        for (int score : scores) {
            if (score > passMark) {
                passed = true;
                System.out.println("At least one passed? " + passed);
                //break;
            } else {
                passed = false;
                System.out.println("No one passed? " + passed);
            }
        }
        String[] members = {"A", "C"};
        boolean sts = getClubResult(members);
        System.out.println("members status: " + sts);
    }

    public static boolean getClubResult(String[] members) {
        boolean status = false;
        if (members.length >= 4) {
            status = true;
        }
        return status;
    }

}
