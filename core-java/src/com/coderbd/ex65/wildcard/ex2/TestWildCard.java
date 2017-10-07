package com.coderbd.ex65.wildcard.ex2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class TestWildCard {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        listA.add(new A("Rahim"));
        processElements(listA);

        //Again......
        List<B> listB = new ArrayList<B>();
        listB.add(new B(50.0));
        listB.add(new B(20.0));
        processElements(listB);
      
        processElementsBitDiffernt(listA);
    }

    public static void processElements(List<?> elements) {
        for (Object o : elements) {
            System.out.println(o);
        }
    }

    public static void processElementsBitDiffernt(
            List<? extends A> elements) {
        for (A a : elements) {
            System.out.println(a);
        }
    }
}
