//Example of multitasking

package com.java.awt.mkpits;

public class MultiTaskingEx3 extends Thread{
    public void run(){
        System.out.println("task one");
    }
}
class Simple2 extends Thread{
    public void run(){
        System.out.println("task two");
    }
}
class TestMultitasking3{
    public static void main(String args[]){
        MultiTaskingEx3 t1=new MultiTaskingEx3();
        Simple2 t2=new Simple2();

        t1.start();
        t2.start();
    }
}


