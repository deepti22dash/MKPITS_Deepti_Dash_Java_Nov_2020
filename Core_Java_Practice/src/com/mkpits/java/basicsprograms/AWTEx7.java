//Example of checkbox
package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx7
{
    AWTEx7(){
        Frame checkB_f= new Frame("Checkbox Example");
        Checkbox cb1 = new Checkbox("Yes", true);
        cb1.setBounds(100,100, 60,60);
        Checkbox cb2 = new Checkbox("No");
        cb2.setBounds(100,150, 60,60);
        checkB_f.add(cb1);
        checkB_f.add(cb2);
        checkB_f.setSize(400,400);
        checkB_f.setLayout(null);
        checkB_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTEx7  ();
    }
}

