//Example of creating collection of 5 students using arraylist class taking input from the user.

package com.mkpits.java.collection;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Enter student name :");
            String str=sc.next();
            student.add(str);
        }
        System.out.println(student);
    }
}
