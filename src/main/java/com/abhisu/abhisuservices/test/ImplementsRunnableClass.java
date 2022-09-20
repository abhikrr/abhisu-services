package com.abhisu.abhisuservices.test;

public class ImplementsRunnableClass implements Runnable{
    static Thread mt;
    public void run(){
        try {
            mt.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 100; i++){
            System.out.println("Implements Runnable : " + i);
        }
    }
}
