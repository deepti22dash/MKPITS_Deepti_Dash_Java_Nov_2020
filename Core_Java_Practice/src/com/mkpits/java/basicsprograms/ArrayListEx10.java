package com.mkpits.java.collection;
import java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListEx10 extends  JFrame{
    JLabel l1,l2;
    JTextField t1,t2;
    JTextArea ta;
    JButton b1,b2,b3,b4,b5;
    ArrayList<String> student =new ArrayList<String>();
    public ArrayListEx10() {
        l1=new JLabel("Enter student name");
        l1.setBounds(10,50,200,30);
        add(l1);
        t1=new JTextField();
        t1.setBounds(220,50,200,30);
        add(t1);
        b1=new JButton("Add student");
        b1.setBounds(100,150,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(t1.getText());
                t1.setText("");
            }
        });
        add(b1);
        b2=new JButton("Display student");
        b2.setBounds(260,150,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for(String str : student) {
                    sb.append("Student name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b2);

        b5=new JButton("Sort student");
        b5.setBounds(420,150,150,30);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(student);
                StringBuilder sb=new StringBuilder();

                for(String str : student) {
                    sb.append("Student name : " + str +"\n");
                }
                ta.setText(sb.toString());
            }
        });
        add(b5);

        ta=new JTextArea("Student list");
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
                String res=   student.get(Integer.parseInt(t2.getText()));
                ta.setText("Student name at index " + t2.getText() + " : " + res );
            }
        });
        add(b3);
        b4=new JButton("Set method");
        b4.setBounds(260,400,150,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.set(Integer.parseInt(t2.getText()),t1.getText()) ;
            }
        });
        add(b4);

        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        ArrayListEx10 arl=new ArrayListEx10();
    }
}

