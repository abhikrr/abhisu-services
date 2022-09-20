package com.abhisu.abhisuservices.test;

public class MainClass {
    public static void main(String[] args) {

        ExtendsThreadClass.mt = Thread.currentThread();
        ExtendsThreadClass ct = new ExtendsThreadClass();
        ct.start();
        ImplementsRunnableClass.mt = Thread.currentThread();
        ImplementsRunnableClass irc = new ImplementsRunnableClass();
        Thread irct = new Thread(irc);
        irct.start();
        for(int i = 0; i < 100; i++){
            System.out.println("Main Thread : " + i);
        }
    }
}
