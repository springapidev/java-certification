package com.coderbd.ex29.expressions;

public class ConCat {

    public String getConcatResult(String title,
        String firstPart, String secondPart) {
        String fullname = title + " " + firstPart + " " + secondPart;
        //System.out.println(fullname);
        return fullname;
    }
}
