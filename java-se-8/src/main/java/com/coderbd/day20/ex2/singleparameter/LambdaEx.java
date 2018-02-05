package com.coderbd.day20.ex2.singleparameter;

/**
 *
 * @author Rajaul Islam
 */
public class LambdaEx {
      public static void main(String[] args) {  
   
        // Lambda expression with single parameter.  
        Sayable s1 = (name)->{  
            return "Name,"+name;  
        };  
        
        System.out.println(s1.say("Munna"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Rashedul"));  
    }  
}
