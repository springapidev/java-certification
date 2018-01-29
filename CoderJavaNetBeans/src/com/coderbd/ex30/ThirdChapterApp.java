package com.coderbd.ex30;
/**
 *
 * @author J2EE-33
 */
/**
 * 
 * @see class declaration
 */
public class ThirdChapterApp{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dog tommy=new Dog();
       tommy.setName("Tommy");
       tommy.setName("Kommy");
       tommy.setColor("Red");
       tommy.setHeight(2.3);
       
        System.out.println("Dog Name-> "+tommy.name+", Color-> "+tommy.getColor()+", Height-> "+tommy.getHeight());
    
    Dog jerry=new Dog("Jerry", "Green",3.3);
    
    System.out.println("Dog Name-> "+jerry.getName()+", Color-> "+jerry.getColor()+", Height-> "+jerry.getHeight());
    }
    /**
     * @see ToDos
     * 1. Create class name Animal
     * 2. Create class name Dog and extrends Animal class
     * 3. Create name, color, height fields in the Dog class
     * 4. Create Dog class default and argumentative constructor
     * 5. create setters and getter methods in the Dog class
     * 6. Now to go Application class and Create Object tommy using default constructor
     * 7. Set name, color and height into the tommy object and then print
     */
}
