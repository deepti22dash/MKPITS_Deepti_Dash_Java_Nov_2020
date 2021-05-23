package com.java.awt.mkpits;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AWTEx16 extends Frame implements WindowListener
{
    AWTEx16()
    {
        addWindowListener(this);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new AWTEx16();
    }
    public void windowActivated(WindowEvent arg0)
    {
        System.out.println(" activated");
    }
    public void windowClosed(WindowEvent arg0)
    {
        System.out.println(" closed");
    }
    public void windowClosing(WindowEvent arg0)
    {
        System.out.println(" closing");
        dispose();
    }
    public void windowDeactivated(WindowEvent arg0)
    {
        System.out.println(" deactivated");
    }
    public void windowDeiconified(WindowEvent arg0)
    {
        System.out.println("deiconified");
    }
    public void windowIconified(WindowEvent arg0)
    {
        System.out.println("iconified");
    }
    public void windowOpened(WindowEvent arg0)
    {
        System.out.println(" opened");
    }
}

