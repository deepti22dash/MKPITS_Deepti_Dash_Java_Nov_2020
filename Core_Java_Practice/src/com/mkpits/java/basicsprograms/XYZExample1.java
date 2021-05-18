//Illustrating changing datatypes of arguments
package com.mkpits.java.basicsprograms;

public class XYZExample1 {
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
    class TestOverloading{
        public static void main(String[] args){
            System.out.println(XYZExample1.add(10,30));
            System.out.println(XYZExample1.add(15.3,12.6));
        }
}


