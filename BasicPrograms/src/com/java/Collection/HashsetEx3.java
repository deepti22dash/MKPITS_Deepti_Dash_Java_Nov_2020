package com.java.collection;
import java.util.*;
public class HashsetEx3 {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("Rinku");
        set.add("Vibha");
        set.add("Rinku");
        set.add("Aarav");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

