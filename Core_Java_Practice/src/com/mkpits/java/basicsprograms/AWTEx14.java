package com.java.awt.mkpits;
import java.awt.*;
import java.awt.event.*;
public class AWTEx14  extends Frame implements MouseListener{
    Label mL_l;
    AWTEx14 (){
        addMouseListener(this);

        mL_l=new Label();
        mL_l.setBounds(10,20,500,100);
        add(mL_l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        mL_l.setText(" Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        mL_l.setText(" Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        mL_l.setText(" Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        mL_l.setText(" Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        mL_l.setText(" Mouse Released");
    }
    public static void main(String[] args) {
        new AWTEx14 ();
    }
}

