package com.java.collection;
import java.util.*;
public class HashsetEx6
{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Rita");
        list.add("Vijaya");
        list.add("Aju");

        HashSet<String> set=new HashSet(list);
        set.add("Gourav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

