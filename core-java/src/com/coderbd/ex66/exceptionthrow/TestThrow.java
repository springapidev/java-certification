package com.coderbd.ex66.exceptionthrow;

/**
 *
 * @author J2EE-33
 */
public class TestThrow {
    /**
     * Use 'throw' statement to throw an exception or 
     * simply use the throw
     * clause with an object reference to throw 
     * an exception. The syntax is
     * 'throw new Exception();'. 
     * Even you can pass the error message to the
     * Exception constructor.
     */
    public static void main(String a[]) {
        try {
            TestThrow met = new TestThrow();
            System.out.println("length of DHAKA is " + met.getStringSize("DHAKA"));
            System.out.println("length of Hasina is " + met.getStringSize("Hasina"));
            System.out.println("length of null string is " + met.getStringSize(null));
        } catch (Exception ex) {
            System.out.println("Exception message: " + ex.getMessage());
        }
    }

    public int getStringSize(String str) throws Exception {
        if (str == null) {
            throw new Exception("String input is null");
        }
        return str.length();
    }
}
