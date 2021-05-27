package com.java.collection;
import java.util.*;
public class HashTableEx4
{
      public static void main(String args[]){
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"John");
        map.put(102,"Clinton");
        map.put(101,"Bella");
        map.put(103,"Sandra");
        System.out.println("Initial Map: "+map);

        map.putIfAbsent(104,"Chris");
        System.out.println("Updated Map: "+map);

        map.putIfAbsent(101,"Vennel");
        System.out.println("Updated Map: "+map);
    }
}

