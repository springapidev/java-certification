package com.coderbd.day7.methods.ex1;

/**
 *
 * @author Instructor
 */
public class MethodEx {

    private String description = "How are you?";//encapsulated field
    private String color = "Red";

   
//Example-1, void does not return any value

    public void display() {
        System.out.println("description: " + description);
        System.out.println("color: " + color);
    }

    //example-2
    public String display(String s1, String s2) {
        String s3 = s1 + ", " + s2;
        return s3;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }
    
    
    
}
