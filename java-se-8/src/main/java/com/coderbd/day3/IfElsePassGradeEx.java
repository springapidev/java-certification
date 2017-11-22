package com.coderbd.day3;

/**
 *
 * @author Instructor
 */
public class IfElsePassGradeEx {

    public static void main(String[] args) {
        getResult(65);
    }

    public static void getResult(int obtainedmark) {
        if (obtainedmark < 0 || obtainedmark > 100) {
            System.out.println(":::Invalid Marks:::");
        } else {
            if (obtainedmark >= 50 && obtainedmark < 60) {
                System.out.println(":::Grade B:::");
            } else if (obtainedmark >= 60 && obtainedmark < 70) {
                System.out.println(":::Grade B+:::");
            }  else if (obtainedmark >= 70 && obtainedmark < 80) {
                System.out.println(":::Grade A-:::");
            } else if (obtainedmark >= 60 && obtainedmark < 70) {
                System.out.println(":::Grade A:::");
            }else {
                System.out.println(":::Other:::");
            }

        }
    }
}
