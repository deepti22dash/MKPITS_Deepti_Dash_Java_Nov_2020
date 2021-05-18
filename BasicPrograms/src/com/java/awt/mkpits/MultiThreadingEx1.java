//Example of thread by extending thread class
package com.java.awt.mkpits;

public class MultiThreadingEx1  extends Thread{
    public void run(){
        System.out.println("My First thread is running extending thread class ...");
    }
    public static void main(String args[]){
        MultiThreadingEx1 t1=new MultiThreadingEx1();
        t1.start();
    }
}


