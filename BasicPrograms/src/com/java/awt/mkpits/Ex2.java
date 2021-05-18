package com.java.awt.mkpits;

import  java.io.*;
        import  java.awt.*;
        import  java.awt.event.*;
public class Ex2 extends  Frame{
    Button b1;
    Label l1,l2,l3;
    TextField tf,tf1;
    Ex2() {
        l1=new Label("Enter your Name");
        l1.setBounds(10,40,100,20);
        add(l1);
        tf=new TextField();
        tf.setBounds(120,40,200,20);
        add(tf);
        l3=new Label("Enter your Email");
        l3.setBounds(10,80,100,20);
        add(l3);
        tf1=new TextField();
        tf1.setBounds(120,80,200,20);
        add(tf1);


        l2=new Label("status");
        l2.setBounds(10,160,200,20);
        add(l2);

        b1=new Button("save");
        b1.setBounds(100,120,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="Name : " +tf.getText();

                String n1="\nEmail : " +tf1.getText();
                try {
                    FileOutputStream fo = new FileOutputStream("D://DocDeepti//sample.txt");
                    byte[] b=n.getBytes();
                    fo.write( b);
                    b=n1.getBytes();
                    fo.write(b);
                    fo.close();
                    l2.setText("successfully saved.");
                }catch (Exception ee) {

                }

            }
        });
        add(b1);
        setSize(350,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ex2 ex=new Ex2();
    }
}

