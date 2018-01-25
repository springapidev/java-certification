/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.Stream;
import java.util.Random;

class GenerateBooleans {
    public static void main(String []args) {
        Random random = new Random();
         Stream.generate(random::nextBoolean)
                  .limit(2)
                  .forEach(System.out::println);
    }
}
