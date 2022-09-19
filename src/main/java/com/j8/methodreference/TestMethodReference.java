package com.j8.methodreference;

public class TestMethodReference {

    public static void m1(){

        for (int i=0; i<=5;i++){
            System.out.println("Child Thread . . .");
        }
    }

    public static void main(String[] args) {
        Runnable r = TestMethodReference::m1;
        Thread t = new Thread(r);
        t.start();

        for (int i = 0;i<=5;i++) {
            System.out.println("Main Thread");
        }
    }
}
