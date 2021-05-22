//Example of textarea
package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx6

{
    AWTEx6()
    {
        Frame textArea_f= new Frame();
        TextArea area=new TextArea("India is incredible!!!");
        area.setBounds(30,40, 200,200);
        textArea_f.add(area);
        textArea_f.setSize(350,400);
        textArea_f.setLayout(null);
        textArea_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTEx6();
    }
}

