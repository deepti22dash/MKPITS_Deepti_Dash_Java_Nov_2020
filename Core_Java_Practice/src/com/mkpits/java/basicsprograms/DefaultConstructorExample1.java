package com.mkpits.java.basicsprograms;

public class DefaultConstructorExample1 {
    int id;
    String name;

    void display()
            {
             System.out.println(id+" "+name);
            }
            public static void main(String args[]){
        DefaultConstructorExample1 s1=new DefaultConstructorExample1();
        DefaultConstructorExample1 s2=new DefaultConstructorExample1();
        s1.display();
        s2.display();
    }
}

