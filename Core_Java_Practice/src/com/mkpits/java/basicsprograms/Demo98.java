package com.mkpits.java.basicsprograms;

public class Demo98{
    void method1(Demo98 obj){
        System.out.println("method is invoked once");
    }
    void show(){
        method1(this);
    }
    public static void main(String args[]){
        Demo98 s1 = new Demo98();
        s1.show();
    }
}


