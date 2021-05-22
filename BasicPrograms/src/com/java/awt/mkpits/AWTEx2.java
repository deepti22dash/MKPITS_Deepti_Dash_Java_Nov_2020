//Example of button

package com.java.awt.mkpits;
import java.awt.*;
import java.awt.event.*;

public class AWTEx2  extends Frame
{
    public AWTEx2 ()
    {
        Button btn=new Button("Indian Ocean");
        add(btn);
        setSize(500, 500);
        setTitle("World's Oceans ");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main (String[] args)
    {
        AWTEx2  ta = new AWTEx2 ();
    }
}

