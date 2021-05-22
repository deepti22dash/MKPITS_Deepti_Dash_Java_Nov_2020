//Example of frame
package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx1

{
    AWTEx1 ()
    {
        Frame fm=new Frame();
        Label lb = new Label("INDIA IS INCREDIBLE!!!");
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setVisible(true);
    }
    public static void main(String args[])
    {
        AWTEx1  awt = new AWTEx1 ();
    }
}

