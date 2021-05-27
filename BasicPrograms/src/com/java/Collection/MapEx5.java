//Example of Map class by comparingByValue()
package com.java.collection;
import java.util.*;
public class MapEx5
{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(789,"Anant");
        map.put(987,"Aarav");
        map.put(678,"Arnav");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}

