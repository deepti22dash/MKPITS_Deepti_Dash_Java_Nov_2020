package com.java.collection;
import java.util.*;
public class HashTableEx2
 {
    public static void main(String args[]) {
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Anita");
        map.put(102,"Rishi");
        map.put(101,"Vaibhav");
        map.put(103,"Rrituraj");
        System.out.println("Before remove: "+ map);
        map.remove(102);
        System.out.println("After remove: "+ map);
    }
}

