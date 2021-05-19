//Example of Filestream
package com.java.awt.mkpits;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class IOEx5
 {
    public static  void main(String[] arg) {
        try {
            PrintWriter writer1 =null;
            writer1 = new PrintWriter(new File("e:\\DocDeepti\\s.txt"));
            writer1.write("oracle microsoft java vc.");
            writer1.flush();
            writer1.close();
            FileReader fr=new FileReader("e:\\DocDeepti\\s.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
        catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}

