package com.java.awt.mkpits;

public class MultiThreadingEx5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        MultiThreadingEx5 t1=new MultiThreadingEx5();
        MultiThreadingEx5 t2=new MultiThreadingEx5();
        MultiThreadingEx5 t3=new MultiThreadingEx5();
        t1.start();
        t2.start();
        t3.start();
    }
}

