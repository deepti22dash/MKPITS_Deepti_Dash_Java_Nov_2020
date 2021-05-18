package com.java.awt.mkpits;

public class MultiThreadingEx3 implements Runnable {
    public void run() {
        for(int i=1;i<15;i++) {
            System.out.println("my thread is running in loop for " + i);
        }
    }
    public static void main(String[] arg) {
        MultiThreadingEx3 th=new MultiThreadingEx3();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();
    }
}

