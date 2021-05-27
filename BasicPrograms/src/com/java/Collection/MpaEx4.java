//Example of comparingByKey() in Descending Order
package com.java.collection;
import java.util.*;
public class MpaEx4
{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(907,"Alka");
        map.put(904,"Viky");
        map.put(906,"Ritu");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

