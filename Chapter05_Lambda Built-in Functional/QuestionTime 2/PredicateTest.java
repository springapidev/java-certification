/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String []args) {
        Predicate<String> notNull =
                ((Predicate<String>)(arg -> arg == null)).negate(); // #1
        System.out.println(notNull.test(null));
    }
}
