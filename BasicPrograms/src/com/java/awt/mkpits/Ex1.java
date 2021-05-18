package com.java.awt.mkpits;

 import  java.io.*;
        import  java.awt.*;
        import  java.awt.event.*;
public class Ex1 extends  Frame{
    Button b1,b2;
    Label l1,l2,l3;
    TextField tf,tf1;
    TextArea ta;
    Ex1() {
        l1=new Label("Enter your name");
        l1.setBounds(10,40,100,20);
        add(l1);
        tf=new TextField();
        tf.setBounds(120,40,200,20);
        add(tf);
        l3=new Label("Enter your email");
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
                    FileOutputStream fo = new FileOutputStream("D://DocDeepti//lx.txt");
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

        ta=new TextArea();
        ta.setBounds(10,200,200,200);
        add(ta);

        b2=new Button("read");
        b2.setBounds(220,120,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileInputStream f=new FileInputStream("D://DocDeepti//lx.txt");
                    int i=0;
                    StringBuilder sb=new StringBuilder();
                    while((i=f.read()) != -1) {
                        sb.append((char)i);
                    }
                    f.close();
                    ta.setText(sb.toString());
                }catch (Exception ee) {

                }

            }
        });
        add(b2);
        setSize(350,500);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {

        Ex1 e= new Ex1();
    }
}
