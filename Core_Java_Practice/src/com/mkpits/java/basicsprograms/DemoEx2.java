package com.mkpits.java.basicsprograms;
public class DemoEx2 {
    DemoEx2()
    {
        this(10);
        System.out.println("INCREDIBLE Z");
    }
    DemoEx2(int x)
    {
        System.out.println(x);
    }
}
    class TestThis{
        public static void main(String args[])
        {
            DemoEx2 d =new DemoEx2();
        }
}


