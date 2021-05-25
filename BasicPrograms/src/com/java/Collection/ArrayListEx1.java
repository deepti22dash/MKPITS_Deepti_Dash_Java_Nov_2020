//Example of creating collection of 5 students using arraylist class
package com.mkpits.java.collection;
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<String>();

        student.add("GOURAV");
        student.add("VIBHA");
        student.add("RINKU");
        student.add("CHUNU");
        student.add("BANKU");
        System.out.println(student);
    }
}

