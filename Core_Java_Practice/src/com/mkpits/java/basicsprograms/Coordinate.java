//Example of runtime interface

package com.java.awt.mkpits;

public class Coordinate {
    public int x,y;
}

interface Shape{
    void draw();
}

class Circle  extends Coordinate implements Shape{
    public void draw(){
        x= 20;
        y= 40;
        System.out.println(" Hello from CIRCLE -draw : x= "+x+" y: "+y);
    }
}
class Rectangle  extends Coordinate implements Shape{
    public void draw(){
        x= 30;
        y= 50;
        System.out.println(" Hello from RECTANGLE -draw :x= "+x+" y: "+y );
    }
}
class test{
    public static void main(String[] args){
        Shape s1=new Circle();
        s1.draw();
        Shape s2=new Rectangle();
        s2.draw();
    }
}