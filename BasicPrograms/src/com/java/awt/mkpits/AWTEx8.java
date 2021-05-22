//Example of choice
package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx8
{
    AWTEx8()
    {
        Frame choice_f= new Frame();
        Choice obj=new Choice();
        obj.setBounds(100,100, 100,100);
        obj.add("Blue");
        obj.add("red");
        obj.add("Black");
        obj.add("Pink");
        obj.add("White");
        obj.add("Green");
        obj.add("Saffron");
        obj.add("Magenta");
        obj.add("Grey");
        obj.add("Yellow");
        choice_f.add(obj);
        choice_f.setSize(400,400);
        choice_f.setLayout(null);
        choice_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTEx8();
    }
}
