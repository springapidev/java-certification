/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.stream.Stream;
import java.util.function.Consumer; 

class ConsumerUse {   
    public static void main(String []args) {
	Stream<String> strings = Stream.of("hello", "world"); 
        Consumer<String> printString = System.out::println;	
	strings.forEach(printString);
    }
}
