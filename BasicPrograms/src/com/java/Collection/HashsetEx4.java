package com.java.collection;
import java.util.*;
 public class HashsetEx4
{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("Rinku");
        set.add("Vibha");
        set.add("Arnav");
        set.add("Suresh");
        System.out.println("An initial list of elements: "+set);
        set.remove("Rinku");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Arnav");
        set1.add("Gourav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        set.removeIf(str->str.contains("Vibha"));
        System.out.println("After invoking removeIf() method: "+set);

        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}

