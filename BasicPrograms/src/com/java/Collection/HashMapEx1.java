//Example of HashMap collection class
package com.java.collection;
import java.util.*;
public class HashMapEx1
{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"smartphone");
        map.put(2,"laptop");
        map.put(3,"tablet");
        map.put(4,"PC");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

