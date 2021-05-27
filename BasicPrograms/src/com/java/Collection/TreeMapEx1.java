//Example of TreeMap
package com.java.collection;
import java.util.*;

public class TreeMapEx1 {
    public static void main(String args[]){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Anisha");
        map.put(102,"Manish");
        map.put(101,"Shankar");
        map.put(103,"Lalit");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}


