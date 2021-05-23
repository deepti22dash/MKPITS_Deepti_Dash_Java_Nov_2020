//Example of lists

package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx9

{
    AWTEx9 ()
    {
        Frame list_f= new Frame();
        List obj=new List(6);
        obj.setBounds(100,100, 100,100);
        obj.add("Blue");
        obj.add("Red");
        obj.add("Black");
        obj.add("Pink");
        obj.add("White");
        obj.add("Green");
        obj.add("Saffron");
        obj.add("Magenta");
        obj.add("Grey");
        obj.add("Yellow");

        list_f.add(obj);
        list_f.setSize(400,400);
        list_f.setLayout(null);
        list_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTEx9 ();
    }
}

