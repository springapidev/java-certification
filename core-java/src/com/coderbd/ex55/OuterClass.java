package com.coderbd.ex55;
//Outer class
public class OuterClass {
public int x = 0;
//nested or inner class
    class InnerClas {
        public int x = 1;
        void methodInInnerClas(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterClass.this.x = "
                    + OuterClass.this.x);
        }
    }
  public static void main(String... args) {
       OuterClass st = new OuterClass();
        OuterClass.InnerClas fl = st.new InnerClas();
        fl.methodInInnerClas(23);
    }

}
