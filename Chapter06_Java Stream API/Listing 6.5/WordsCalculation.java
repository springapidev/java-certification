/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Arrays;

public class WordsCalculation {
    public static void main(String []args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());
    }
}

