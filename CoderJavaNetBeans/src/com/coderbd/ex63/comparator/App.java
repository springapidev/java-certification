
package com.coderbd.ex63.comparator;
public class App {
     public static void main(String[] args) {
        Student student1=new Student("Shamim", "Ah", 456, 4.69);
        Student student2=new Student("Shamim", "Ah", 457, 4.69);
       NameCom nc=new NameCom();
         System.out.println(""+nc.compare(student1, student2));
   
       //  GradeComp gc=new GradeComp();
       
      // System.out.println(""+gc.compare(student1, student2));
     }
}
