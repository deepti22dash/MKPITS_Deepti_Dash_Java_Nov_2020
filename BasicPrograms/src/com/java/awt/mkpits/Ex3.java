package com.java.awt.mkpits;
import  java.io.*;
        import  java.awt.*;
        import  java.awt.event.*;
public class Ex3 extends  Frame{
    Button b1,b2;
    Label l1,l2,l3;
    TextField tf,tf1;
    TextArea ta;
    Ex3() {

        l1=new Label("Enter your name");
        l1.setBounds(10,40,100,20);
        add(l1);
        tf=new TextField();
        tf.setBounds(120,40,200,20);
        add(tf);
        l3=new Label("Enter  your email");
        l3.setBounds(10,80,100,20);
        add(l3);
        tf1=new TextField();
        tf1.setBounds(120,80,200,20);
        add(tf1);


        l2=new Label("status");
        l2.setBounds(10,160,200,20);
        add(l2);

        b1=new Button("Save");
        b1.setBounds(100,120,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="Name : " +tf.getText();

                String n1="\nEmail : " +tf1.getText();
                try {
                    FileOutputStream fo = new FileOutputStream("D://DocDeepti//lx.txt");
                    BufferedOutputStream bo=new BufferedOutputStream(fo);
                    byte[] b=n.getBytes();
                    bo.write( b);
                    b=n1.getBytes();
                    bo.write(b);
                    bo.close();
                    fo.close();
                    l2.setText("successfully registered.");
                }catch (Exception ee) {

                }

            }
        });
        add(b1);

        ta=new TextArea();
        ta.setBounds(10,200,200,200);
        add(ta);

        b2=new Button("read");
        b2.setBounds(220,120,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fn=tf.getText();
                    FileInputStream f=new FileInputStream(fn);
                    BufferedInputStream bi=new BufferedInputStream(f);
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while((i=bi.read()) != -1) {
                        sb.append((char)i);
                    }
                    bi.close();
                    f.close();
                    ta.setText(sb.toString());
                }catch (Exception ee) {
                    ta.setText(ee.toString());
                }

            }
        });
        add(b2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        Ex3 e =new Ex3();
    }
}

