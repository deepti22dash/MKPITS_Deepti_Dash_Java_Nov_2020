//Example of comparable interface


package com.java.collection;
import java.util.*;
import java.io.*;
class Students implements Comparable<Students>{
    int rollno;
    String name;
    int age;
    Students(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Students st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableE1{
    public static void main(String args[]){
        ArrayList<Students> al=new ArrayList<Students>();
        al.add(new Students(108,"Radha",23));
        al.add(new Students(106,"Shyam",27));
        al.add(new Students(105,"Meera",21));

        Collections.sort(al);
        for(Students st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

