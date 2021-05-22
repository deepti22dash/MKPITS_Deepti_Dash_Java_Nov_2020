package com.java.awt.mkpits;

public class ExampleOFtostring {
    int rollno;
    String name;
    String city;

    ExampleOFtostring(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){
        return rollno+" "+name+" "+city;
    }
    public static void main(String args[]){
        ExampleOFtostring s1=new ExampleOFtostring(111,"Gourav","Bargarh");
        ExampleOFtostring s2=new ExampleOFtostring(222,"Vibha","Jharsuguda");

        System.out.println(s1);
        System.out.println(s2);
    }
}

