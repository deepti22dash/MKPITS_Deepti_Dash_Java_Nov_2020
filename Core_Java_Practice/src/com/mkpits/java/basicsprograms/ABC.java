// Method overloading by changing number of arguments
package com.mkpits.java.basicsprograms;

public class ABC {
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
    class TestOverloading1{
        public static void main(String[] args){
            System.out.println(ABC.add(11,11));
            System.out.println(ABC.add(11,11,11));
        }
}


