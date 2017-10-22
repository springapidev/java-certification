package com.coderbd.ex57.anonymousInterface;
public class AnonymousInterfaceDemo {
    public static void main(String[] args) {
        Animal animal=new Animal() {

            @Override
            public void bite() {
                System.out.println("Animal can bit");
            }

            @Override
            public void run() {
               System.out.println("Animal can run");
            }
        };
        
        animal.bite();
        animal.run();
    }

}
