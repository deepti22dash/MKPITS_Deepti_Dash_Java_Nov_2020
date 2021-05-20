package com.java.awt.mkpits;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MultiThreadingEx15 implements Runnable {
    private String message;
    public MultiThreadingEx15(String s){
        this.message=s;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


