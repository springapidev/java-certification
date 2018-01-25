/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.Optional;

public class OptionalStream {
    public static void main(String []args) {
Optional<String> string = Optional.of("  abracadabra  ");
    	string.map(String::trim).ifPresent(System.out::println);
    }
}
