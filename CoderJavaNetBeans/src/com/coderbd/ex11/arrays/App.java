package com.coderbd.ex11.arrays;

public class App{

    public static void main(String[] args){

        System.out.println(new App().createArray() );
    }

    public char[] createArray(){

    char[] chars=new char[26];
    for (int i=0; i<chars.length; i++){
       // chars[i]=(char)('A' + i);
        //chars[i]=(char)('1' + i);
        chars[-26]=(char)('A' + i);
        chars[-26]=(char)('A' + i);
    }
    return chars;
    }
    /**
     * If I use line 16 or 17, then
     * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 26
     at com.coderbd.ex11.arrays.App.createArray(App.java:16)
     at com.coderbd.ex11.arrays.App.main(App.java:7)

     */
    /**
     * If an array out of index, then it will causes runtime exception;
     */
}
