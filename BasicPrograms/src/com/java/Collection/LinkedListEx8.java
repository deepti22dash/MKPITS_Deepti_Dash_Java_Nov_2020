//Example of get() set()
package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx8
{
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        list.add("Pear");
        list.add("Apricot");
        list.add("Blueberry");
        list.add("Guava");
        System.out.println("Returning element: "+list.get(1));
        list.set(1,"Plum");
        for(String fruit:list)
            System.out.println(fruit);

    }
}

