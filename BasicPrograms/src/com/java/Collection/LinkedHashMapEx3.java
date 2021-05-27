//Example of linkedHashMap illustrating remove().
package com.java.collection;
import java.util.*;
public class LinkedHashMapEx3
{
    public static void main(String args[]) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amol");
        map.put(102,"Vivek");
        map.put(103,"suman");
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);
    }
}

