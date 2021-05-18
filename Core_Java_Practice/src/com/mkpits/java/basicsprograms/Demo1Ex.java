package com.mkpits.java.basicsprograms;

public class Demo1Ex {
    Demo1Ex(){System.out.println("CHOCOLATE a");}
    Demo1Ex(int x)
    {
        this();
        System.out.println(x);
    }
}
class TestThis1{
        public static void main(String args[]){
            Demo1Ex a=new Demo1Ex(444);
        }
}


