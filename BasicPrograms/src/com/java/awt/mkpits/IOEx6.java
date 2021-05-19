package com.java.awt.mkpits;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class IOEx6
{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\DocDeepti\\testout.txt ");
        PrintStream pout=new PrintStream(fout);
        pout.println(2021);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }
}


