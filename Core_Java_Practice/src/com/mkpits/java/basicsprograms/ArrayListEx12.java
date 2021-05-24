package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx12 {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter student name");
            String sn=sc.next();
            student.add(sn);
        }
        for(int i=0;i<student.size();i++) {
            System.out.println(student.get(i));
        }
    }
}

