// Example of multithreading using implementing runnable interface
package com.java.awt.mkpits;

public class MultiThreadingEx2 implements Runnable{
    public void run(){
        System.out.println("Thread is running by implementing runnable interface...");
    }
    public static void main(String args[]){
        MultiThreadingEx2 m1=new MultiThreadingEx2();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}

