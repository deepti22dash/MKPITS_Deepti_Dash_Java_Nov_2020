package com.mkpits.java.basicsprograms;

public class ConstructorOverloadingExample {
    int id;
    String name;
    int age;
    //creating two arg constructor
    ConstructorOverloadingExample(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    ConstructorOverloadingExample(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[]){
        ConstructorOverloadingExample s1 = new ConstructorOverloadingExample(105,"Gourav");
        ConstructorOverloadingExample s2 = new ConstructorOverloadingExample(106,"Vibha",25);
        s1.display();
        s2.display();
    }
}


