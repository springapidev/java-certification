
package com.coderbd.ex55;
public class Outer {
   private int x=5;
   
   class Inner{
   int x=10;
   
   public void display(int x){
       System.out.println("x: "+x);
       System.out.println("this.x: "+this.x);
       System.out.println("Outer.this.x: "+Outer.this.x);
   }
   }
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.display(23);
        
    }
}
