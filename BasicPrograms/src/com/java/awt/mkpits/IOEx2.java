// Example of Filewriter
package com.java.awt.mkpits;
import java.io.FileWriter;
public class IOEx2
{
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\DocDeepti\\sample.txt");
            fw.write("India is Incredible !.");
            fw.close();
        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}