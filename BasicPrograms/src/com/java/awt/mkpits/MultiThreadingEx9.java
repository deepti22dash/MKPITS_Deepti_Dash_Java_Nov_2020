package com.java.awt.mkpits;

public class MultiThreadingEx9  extends Thread{
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
        MultiThreadingEx9 t1=new MultiThreadingEx9();
        MultiThreadingEx9 t2=new MultiThreadingEx9();
        MultiThreadingEx9 t3=new MultiThreadingEx9();
        t1.run();
        t2.run();
        t3.run();
    }
}

