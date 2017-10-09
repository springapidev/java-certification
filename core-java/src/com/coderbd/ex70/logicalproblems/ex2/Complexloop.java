package com.coderbd.ex70.logicalproblems.ex2;

/**
 *
 * @author J2EE-33
 */
public class Complexloop {

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] argv) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }
    }
}
