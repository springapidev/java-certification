package com.coderbd.ex65.wildcard;

import java.util.List;

/**
 *
 * @author J2EE-33
 */
public class TestWildCard {
    
    
   public static void insertElements(List<? super A> list){
    list.add(new A());
    list.add(new B());
    list.add(new C());
     // list.add(new D()); wrong
  
}
    
}
