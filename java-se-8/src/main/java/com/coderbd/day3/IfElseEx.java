package com.coderbd.day3;

public class IfElseEx {

    private static int passMarks = 50;

    public static void main(String[] args) {
        getResult(52);
    }

    /**
     *@aut
     * @param obtainedmark
     */
    public static void getResult(int obtainedmark) {

        if (obtainedmark >= passMarks) {
            System.out.println(":::Passed:::");
        } else {
            System.out.println(":::Failed:::");
        }

    }

}
