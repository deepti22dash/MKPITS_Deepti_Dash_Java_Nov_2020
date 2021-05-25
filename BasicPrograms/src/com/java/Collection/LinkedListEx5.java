package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx5
{
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("TV");
        list.add("Smartphone");
        list.add("AC");
        list.add("Sofa");
        for(String fruit:list)
            System.out.println(fruit);

    }
}

