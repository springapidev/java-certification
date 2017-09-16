package com.coderbd.ex29.expressions;
public class TestExpression {
   int x = 5 + 5; // Compound Expression
   int y=10;//Simple Expression
   //x<2;
   
  // x & 22;
  public static void main(String[] args) {
    //4.10
     boolean x=true;
     boolean y=false;
     boolean result=x || y;
    // boolean result2=x>=7;
      System.out.println("Result-> "+result);
    // System.out.println("Result2-> "+result2);
     
       ConCat conCat=new ConCat();
      // conCat.getConcatResult("Mr", "Shamim", "Sarkar");
        System.out.println(conCat.getConcatResult("Mr", "Shamim", "Sarkar"));
    
  
  
  
  
  
  
  
  }
}
