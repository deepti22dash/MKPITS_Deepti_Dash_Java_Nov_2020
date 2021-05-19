//Example of Filereader
package com.java.awt.mkpits;
import java.io.FileReader;
public class IOEx3
 {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("D:\\DocDeepti\\sample.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}

