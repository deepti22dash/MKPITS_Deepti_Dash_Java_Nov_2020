package com.java.collection;
import java.util.*;
public class TreeMapEx2
 {
    public static void main(String args[]) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Arya");
        map.put(102,"Dilip");
        map.put(101,"Sonu");
        map.put(103,"Siki");
        System.out.println("Before invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(102);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

