// Example of CHARARRAYWRITER()
package com.java.awt.mkpits;
import java.io.CharArrayWriter;
import java.io.FileWriter;
public class IOEx4
 {
    public static void main(String args[])throws Exception{
        CharArrayWriter out=new CharArrayWriter();
        out.write("India Is Incredible !");
        FileWriter f1=new FileWriter("D:\\DocDeepti\\a.txt");
        FileWriter f2=new FileWriter("D:\\DocDeepti\\b.txt");
        FileWriter f3=new FileWriter("D:\\DocDeepti\\c.txt");
        FileWriter f4=new FileWriter("D:\\DocDeepti\\d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Successful...");
    }
}
