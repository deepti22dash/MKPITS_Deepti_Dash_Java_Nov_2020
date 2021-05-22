//Example of awt button.
package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx3
{
    public static void main(String[] args)
    {
        Frame f1=new Frame("Registration");
        Button b1=new Button("SAVE");
        b1.setBounds(80,200,80,50);
        f1.add(b1);
        f1.setSize(500,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
