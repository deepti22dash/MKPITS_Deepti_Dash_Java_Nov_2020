package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx21 extends JFrame {
    JLabel l1,l2;
    JTextField t1,t2;
    JTextArea ta;
    JButton b1,b2,b3,b4,b5;
    ArrayList<String> product =new ArrayList<String>();
    public ArrayListEx21() {
        l1=new JLabel("Enter product name");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new JTextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new JButton("Add product");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2=new JButton("Display product");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str : product) {
                    sb.append("product name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);

        b5=new JButton("Sort product");
        b5.setBounds(420,150,150,30);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(product);
                StringBuilder sb=new StringBuilder();

                for(String str : product) {
                    sb.append("product name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b5);

        ta=new JTextArea("product list");
        ta.setBounds(100,200,300,150);
        add(ta);

        l2=new JLabel("Enter index no to view ");
        l2.setBounds(10,360,200,30);
        add(l2);
        t2=new JTextField();
        t2.setBounds(220,360,200,30);
        add(t2);
        b3=new JButton("Get method");
        b3.setBounds(100,400,150,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res= product.get(Integer.parseInt(t2.getText()));
                ta.setText("product name at index " + t2.getText() + " : " + res );
            }
        });
        add(b3);
        b4=new JButton("Set method");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.set(Integer.parseInt(t2.getText()),t1.getText()) ;
            }
        });
        add(b4);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }
    public static void main(String[] args) {

        ArrayListEx21 arl=new ArrayListEx21();
    }
}
