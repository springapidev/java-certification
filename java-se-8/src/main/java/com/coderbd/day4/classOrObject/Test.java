package com.coderbd.day4.classOrObject;

/**
 *
 * @author Instructor
 */
public class Test {
  public static void main(String[] args) {
      //Way-1
      Animal animal1 = new Animal();
      animal1.setId(10);
      animal1.setName("Mr Tommy");
      
        System.out.println("ID: " + animal1.getId());
        System.out.println("Name: " + animal1.getName());
        
        //Way-2
        
        Animal animal2=new Animal(11, "Jerry");
         System.out.println("ID: " + animal2.getId());
        System.out.println("Name: " + animal2.getName());
        
    }  
}
