package com.coderbd.day4.classOrObject;

/**
 *
 * @author Instructor
 */
public class Animal {

    private  int id;//Encapsulated field
    private String name;//Encapsulated field
//constructor

    public Animal() {
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

  
    
    
    //Getter Method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
