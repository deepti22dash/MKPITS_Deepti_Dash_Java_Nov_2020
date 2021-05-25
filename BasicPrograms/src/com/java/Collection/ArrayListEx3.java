//Example traversing list through iterator

package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx3
 {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Enter student name:");
            String s=sc.next();
            stud.add(s);
        }

        Iterator itr=stud.iterator();
        while (itr.hasNext()) {
            System.out.println("student name : " + itr.next());
        }
    }
}

