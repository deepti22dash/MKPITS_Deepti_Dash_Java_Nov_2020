package com.java.awt.mkpits;

public class MultiTaskingExample extends Thread{
    public void run(){
        System.out.println("task started");
    }
    public static void main(String args[]){
        MultiTaskingExample t1=new MultiTaskingExample();
        MultiTaskingExample t2=new MultiTaskingExample();
        MultiTaskingExample t3=new MultiTaskingExample();

        t1.start();
        t2.start();
        t3.start();
    }
}

