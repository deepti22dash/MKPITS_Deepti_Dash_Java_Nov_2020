//Example of multitasking example2
package com.java.awt.mkpits;

public class MultiTaskingExample2 implements Runnable{
    public void run(){
        System.out.println("Task Started");
    }
    public static void main(String args[]){
        Thread t1 =new Thread(new MultiTaskingExample2());
        Thread t2 =new Thread(new MultiTaskingExample2());
        t1.start();
        t2.start();
    }
}

