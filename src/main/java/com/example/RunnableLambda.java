package com.example;

public class RunnableLambda {

    public static void main(String a[]) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i <3; i++) {
                    System.out.println("Hello from "+Thread.currentThread().getName());
                }
            }
        };

        Runnable runnableLambda = () -> {
            for(int i =0; i <3; i++) {
                System.out.println("Hello from "+Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(runnableLambda);
        t.start();
        t.join();
    }
}
