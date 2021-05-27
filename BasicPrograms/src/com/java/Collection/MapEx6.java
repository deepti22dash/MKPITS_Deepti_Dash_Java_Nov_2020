//Example of  Map class by comparingByValue() in Descending Order
package com.java.collection;
import java.util.*;
public class MapEx6
{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(987,"Shiva");
        map.put(108,"Vinit");
        map.put(456,"Daya");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

