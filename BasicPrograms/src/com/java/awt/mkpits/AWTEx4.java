//Example of label

package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx4
{
    public static void main(String args[])
    {
        Frame l_Frame= new Frame("Registration");
        Label l1,l2;
        l1=new Label("Enter name :");
        l1.setBounds(50,50,200,30);
        l2=new Label("Enter password :");
        l2.setBounds(50,100,200,30);
        l_Frame.add(l1);
        l_Frame.add(l2);
        l_Frame.setSize(500,500);
        l_Frame.setLayout(null);
        l_Frame.setVisible(true);
    }
}

