package com.java.collection;
import java.util.*;
public class HashTableEx3
{
    public static void main(String args[]){
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();
        map.put(100,"Anil");
        map.put(102,"Nitin");
        map.put(101,"Gagan");
        map.put(103,"Trilok");

        System.out.println(map.getOrDefault(101, "Not Found"));
        System.out.println(map.getOrDefault(105, "Not Found"));
    }
}

