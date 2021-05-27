//Example of hashmap using remove()
package com.java.collection;
import java.util.*;
public class HashMapEx4
 {
    public static void main(String args[]) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Abha");
        map.put(101,"Vibha");
        map.put(102,"Shobha");
        map.put(103, "Gourav");
        System.out.println("Initial list of elements: "+map);

        map.remove(100);
        System.out.println("Updated list of elements: "+map);

        map.remove(101);
        System.out.println("Updated list of elements: "+map);

        map.remove(102, "Rinku");
        System.out.println("Updated list of elements: "+map);
    }
}

