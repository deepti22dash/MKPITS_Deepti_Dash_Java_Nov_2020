package com.mkpits.java.basicsprograms;

public class ExampleParameterisedConstructor {
    int id;
    String name;
    String address;
    ExampleParameterisedConstructor(int i,String n, String add){
        id = i;
        name = n;
        address=add;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+address);
    }
    public static void main(String args[]){
        ExampleParameterisedConstructor s1 = new ExampleParameterisedConstructor(101,"ARNAV","ITPS");
        ExampleParameterisedConstructor s2 = new ExampleParameterisedConstructor(202,"AARAV","JHARSUGUDA");
        s1.display();
        s2.display();
    }
}


