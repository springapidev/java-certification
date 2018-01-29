
package com.coderbd.ex62.comparable;
public class App {
    public static void main(String[] args) {
        Student student1=new Student("Shamim", "Ah", 456, 4.59);
        Student student2=new Student("Parvez", "Ah", 457, 4.59);
        System.out.println(""+student1.compareTo(student2));
    }
  
}
