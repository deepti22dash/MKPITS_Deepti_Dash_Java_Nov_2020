package com.java.awt.mkpits;
import java.awt.*;
import java.awt.event.*;
public class AWTEx15 extends Frame implements MouseMotionListener{
    AWTEx15(){
        addMouseMotionListener(this);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent a) {
        Graphics mM_g=getGraphics();
        mM_g.setColor(Color.ORANGE);
        mM_g.fillOval(a.getX(),a.getY(),10,10);
    }
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new AWTEx15();
    }
}

