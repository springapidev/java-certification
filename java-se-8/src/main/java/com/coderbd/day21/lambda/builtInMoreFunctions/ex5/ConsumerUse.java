package com.coderbd.day21.lambda.builtInMoreFunctions.ex5;
import java.util.function.ObjIntConsumer;

class ConsumerUse {
    public static void main(String []args) {
       ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i); // #1 
       charAt.accept("java", 2);
       //System.out.println(charAt.accept("java", 2));          // #2 
    }
}
