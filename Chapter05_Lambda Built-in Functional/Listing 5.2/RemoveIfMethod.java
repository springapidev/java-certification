/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.List;
import java.util.ArrayList;

public class RemoveIfMethod {
    public static void main(String []args) {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");

        greeting.removeIf(str -> !str.startsWith("h"));
        greeting.forEach(System.out::println);
    }
} 
