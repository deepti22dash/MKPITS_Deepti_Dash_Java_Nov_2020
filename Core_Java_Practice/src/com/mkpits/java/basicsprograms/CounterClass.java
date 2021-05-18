package com.mkpits.java.basicsprograms;

public class CounterClass {
    int count=8;

    CounterClass (){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        CounterClass  c1=new CounterClass ();
        CounterClass  c2=new CounterClass ();
        CounterClass  c3=new CounterClass ();
    }
}


