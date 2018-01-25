/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.Predicate;

public class PredUse {
    public static void main(String args[]){
        Predicate<String> predContains = "I am going to write OCP8 exam"::contains;
        checkString(predContains, "OCPJP");
    }
    static void checkString(Predicate<String> predicate, String str) {
        System.out.println(predicate.test(str) ? "contains" : "doesn't contain");
    }
}
