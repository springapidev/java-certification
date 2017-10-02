package com.coderbd.ex55;

public class OuterForUnstandingLocalInnerClas {
    private int data = 30;//instance variable  
    void display() {
        class Local {

            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        OuterForUnstandingLocalInnerClas obj = new OuterForUnstandingLocalInnerClas();
        obj.display();
    }
}
