/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.util.function.Function;

public class AndThen {
    public static void main(String []args) {
        Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), 
			negateSquare = negate.compose(square);

        System.out.println(negateSquare.apply(10));
    }
}
