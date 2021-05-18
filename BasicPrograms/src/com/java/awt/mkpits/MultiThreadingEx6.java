// Example of join method()
package com.java.awt.mkpits;

public class MultiThreadingEx6 extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(500);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        MultiThreadingEx6 t1=new MultiThreadingEx6();
        MultiThreadingEx6 t2=new MultiThreadingEx6();
        MultiThreadingEx6 t3=new MultiThreadingEx6();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}


