package com.coderbd.ex66.exceptionCustom;
/**
 *
 * @author J2EE-33
 */
public class CustomException extends Exception {

    private String message = null;

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public CustomException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
