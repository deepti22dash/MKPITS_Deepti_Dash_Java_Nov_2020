package com.mkpits.java.collection;
import java.awt.*;
import  java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayListEx17 extends Frame {
    Label l1,l2;
    TextField t1;
    TextArea ta;
    Button b1,b2;
    ArrayList<String> product =new ArrayList<String>();
    public ArrayListEx17() {
        l1=new Label("Enter Product name:");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new TextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new Button("Add product");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2=new Button("Display product");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str :product) {
                    sb.append("product name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);
        ta=new TextArea("Product list");
        ta.setBounds(100,200,300,150);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }
    public static void main(String[] args) {
        ArrayListEx17 arl=new ArrayListEx17();
    }
}

