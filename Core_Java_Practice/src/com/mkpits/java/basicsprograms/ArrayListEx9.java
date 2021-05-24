package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx9
 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);

        for(String str : stud) {
            System.out.println("Student name " + str);
        }
    }
}

