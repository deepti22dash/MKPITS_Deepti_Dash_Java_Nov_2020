// Example of comparingByKey()
package com.java.collection;
import java.util.*;
public class MapEx3NonGeneric
{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(901,"Mangal");
        map.put(909,"Som");
        map.put(905,"Ravi");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

