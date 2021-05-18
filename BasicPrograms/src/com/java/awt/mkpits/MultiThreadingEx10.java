//  Example of sleep() method
package com.java.awt.mkpits;

public class MultiThreadingEx10 extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        MultiThreadingEx10 t1=new MultiThreadingEx10();
        MultiThreadingEx10 t2=new MultiThreadingEx10();

        t1.start();
        t2.start();
    }
}
