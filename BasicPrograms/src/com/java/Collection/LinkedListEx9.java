//Example for sorting list

package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx9
{
    public static void main(String args[]){
        List<String> list1=new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        Collections.sort(list1);
        for(String fruit:list1)
            System.out.println(fruit);

        System.out.println("Sorting numbers...");
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(32);
        list2.add(19);
        list2.add(45);
        list2.add(1);
        Collections.sort(list2);
        for(Integer number:list2)
            System.out.println(number);
    }
}


