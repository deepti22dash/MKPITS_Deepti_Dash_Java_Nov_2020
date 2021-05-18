package com.mkpits.java.basicsprograms;

public class ExampleStatic {
    int rollno;//instance variable
    String name;
    static String college ="IIT";
    ExampleStatic (int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
    //Test class to show the values of objects
     class TestStaticVariable1{
        public static void main(String args[]){
            ExampleStatic  s1 = new ExampleStatic (555,"Gourav");
            ExampleStatic  s2 = new ExampleStatic (987,"Vaibhav");
            s1.display();
            s2.display();
        }
    }


