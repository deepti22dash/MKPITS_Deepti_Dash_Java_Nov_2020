//Example of iterating arraylist using foreach loop

package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx4
 {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Enter student name:");
            String s=sc.next();
            student.add(s);
        }

        for(String str : student) {
            System.out.println("student name " + str);
        }
    }
}

