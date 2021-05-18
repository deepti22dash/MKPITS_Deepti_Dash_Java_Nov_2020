package com.java.awt.mkpits;

public class MultiThreadingEx8 extends Thread{
    public void run(){
        System.out.println(" Thread is running...");
    }
    public static void main(String args[]){
        MultiThreadingEx8 t1=new MultiThreadingEx8();
        t1.run();
    }
}

