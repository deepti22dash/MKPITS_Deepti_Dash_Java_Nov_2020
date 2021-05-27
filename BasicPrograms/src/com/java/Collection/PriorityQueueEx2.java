package com.java.collection;
import java.util.*;

class Student implements Comparable<Student>{
    int roll_no;
    String name, address;
    int ph_no;

    public Student(int roll_no, String name, String address, int ph_no) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
        this.ph_no = ph_no;
    }
    public int compareTo(Student s) {
        if(roll_no>s.roll_no){
            return 1;
        }else if(roll_no<s.roll_no){
            return -1;
        }else{
            return 0;
        }
    }
}
public class PriorityQueueEx2  {
    public static void main(String[] args) {
        Queue<Student> queue=new PriorityQueue<Student>();

        Student s1=new Student(101,"Gourav Dash","Bragarh",9876554);
        Student s2=new Student(983,"Vibha Dash", "Jharsuguda", 1234456);
        Student s3=new Student(135,"Tripti Dash","Sampbalpur",567890312);

        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        System.out.println("Traversing the queue elements:");

        for(Student s:queue)
        {
            System.out.println(s.roll_no+" "+s.name+" "+s.address+" " +s.ph_no);
        }
        queue.remove();
        System.out.println("After removing one student record:");
        for(Student s:queue)
        {
            System.out.println(s.roll_no+" "+s.name+" "+s.address+" " +s.ph_no);
        }
    }
}
