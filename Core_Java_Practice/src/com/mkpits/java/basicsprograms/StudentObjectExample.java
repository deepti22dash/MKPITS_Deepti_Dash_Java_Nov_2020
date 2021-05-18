package com.mkpits.java.basicsprograms;

public class StudentObjectExample {
    int id;
    String name;
    StudentObjectExample(int i,String n){
        id = i;
        name = n;
    }
    StudentObjectExample(){}
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        StudentObjectExample s1 = new StudentObjectExample(101,"Rinku");
        StudentObjectExample s2 = new StudentObjectExample();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}


