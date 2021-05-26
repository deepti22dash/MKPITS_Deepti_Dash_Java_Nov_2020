package com.java.collection;
import javax.swing.*;

public class SwingEx2  extends JFrame
{
    JFrame f;
    SwingEx2 (){
        JButton b=new JButton("click me");
        b.setBounds(130,100,100, 40);

        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingEx2 ();
    }
}

