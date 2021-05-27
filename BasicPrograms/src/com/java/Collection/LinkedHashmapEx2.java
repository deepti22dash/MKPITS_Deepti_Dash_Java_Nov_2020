//Example of LinkedHashMap using key-value pair
package com.java.collection;
import java.util.*;
public class LinkedHashmapEx2
{
    public static void main(String args[]){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Chanchal");
        map.put(101,"Pankaj");
        map.put(102,"Yogesh");

        System.out.println("Keys: "+map.keySet());

        System.out.println("Values: "+map.values());

        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}

