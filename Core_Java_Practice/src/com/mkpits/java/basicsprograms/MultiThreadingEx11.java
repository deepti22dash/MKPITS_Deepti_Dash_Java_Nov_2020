package com.java.awt.mkpits;

public class MultiThreadingEx11 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        MultiThreadingEx11 t1=new MultiThreadingEx11();
        t1.start();
        t1.start();
    }
}

