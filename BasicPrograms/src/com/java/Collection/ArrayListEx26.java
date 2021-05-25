package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Student {
    int roll_no;
    int age;
    String name;

    public Student(int roll_no,int age, String name) {
        this.roll_no=roll_no;
        this.age=age;
        this.name = name;
    }
}

public class ArrayListEx26  {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        Student s1=new Student(101,22,"Gourav");
        Student s2=new Student(102,24,"Vibha");
        Student s3=new Student(103,21,"Rounak");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(Student s:list){
            System.out.println(s.roll_no+" "+s.age+" "+s.name+" ");
        }
    }
}
