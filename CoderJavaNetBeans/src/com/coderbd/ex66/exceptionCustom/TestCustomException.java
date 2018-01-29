package com.coderbd.ex66.exceptionCustom;

/**
 *
 * @author J2EE-33
 */
public class TestCustomException {
        public static void main(String[] a){
        try{
            TestCustomException.myTestmethod(null);
        } catch(CustomException mae){
            System.out.println("Inside catch block: "+mae.getMessage());
        }
    }
     
    static void myTestmethod(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String val is null");
        }
    }
}
