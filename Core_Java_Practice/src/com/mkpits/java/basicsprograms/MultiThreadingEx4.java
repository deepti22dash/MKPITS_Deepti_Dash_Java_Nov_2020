package com.java.awt.mkpits;

public class MultiThreadingEx4 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        MultiThreadingEx4 t1=new MultiThreadingEx4();
        MultiThreadingEx4 t2=new MultiThreadingEx4();
        MultiThreadingEx4 t3=new MultiThreadingEx4();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("Name of t3:"+t3.getName());

        t1.start();
        t2.start();
        t3.start();
        t1.setName("Vibha Dash");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}
