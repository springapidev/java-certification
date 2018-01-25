/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.ObjIntConsumer;

class ConsumerUse {
    public static void main(String []args) {
       ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i); // #1 
       System.out.println(charAt.accept("java", 2));          // #2 
    }
}
