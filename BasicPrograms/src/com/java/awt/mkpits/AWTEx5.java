//Example of textfield

package com.java.awt.mkpits;
import java.awt.*;

public class AWTEx5 {
    public static void main(String args[]){
        Frame TextF_f= new Frame("Registration");
        TextField text1,text2;
        text1=new TextField("Welcome to India");
        text1.setBounds(60,100, 230,40);
        text2=new TextField("Welcome to Odisha");
        text2.setBounds(60,150, 230,40);
        TextF_f.add(text1);
        TextF_f.add(text2);
        TextF_f.setSize(500,500);
        TextF_f.setLayout(null);
        TextF_f.setVisible(true);
    }
}

