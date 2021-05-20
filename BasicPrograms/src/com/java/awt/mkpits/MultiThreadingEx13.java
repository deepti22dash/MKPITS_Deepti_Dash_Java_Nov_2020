//Example of Daemon threads
package com.java.awt.mkpits;

public class MultiThreadingEx13 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        MultiThreadingEx13 t1=new  MultiThreadingEx13();
        MultiThreadingEx13 t2=new  MultiThreadingEx13();
        MultiThreadingEx13 t3=new  MultiThreadingEx13();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();
        t2.start();
        t3.start();
    }
}

