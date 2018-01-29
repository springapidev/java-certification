package com.coderbd.ex8;

public interface Test {
    String type = "Foreigner";

    void run();

//Umcomment me and checking using Java 8
/*
     String getType(){

        return type;

    }*/
    /**
     * From java SE 8, we can use static and/or default methods in interfaces,
     * but they should be non-abstract methods. So, in this case,
     * using default in blank is completely legal, Hence option C is correct.

     * abstract is incorrect as given method is not abstract, so can’t use abstract there.

     * public incorrect as we can’t have non-abstract method interface if they are not default or static.
     *     REFERENCE        : https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html
     */
}
