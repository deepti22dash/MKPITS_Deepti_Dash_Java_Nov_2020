package com.java.awt.mkpits;

public class MultiThreadingEx12 extends Thread{
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        MultiThreadingEx12 m1=new MultiThreadingEx12();
        MultiThreadingEx12 m2=new MultiThreadingEx12();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();

    }
}

