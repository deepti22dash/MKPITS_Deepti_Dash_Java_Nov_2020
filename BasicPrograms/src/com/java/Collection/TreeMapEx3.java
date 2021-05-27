package com.java.collection;
import java.util.*;
public class TreeMapEx3
{
    public static void main(String args[]){
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Bhavna");
        map.put(102,"Uma");
        map.put(101,"Archana");
        map.put(103,"Shiddharth");

        System.out.println("headMap: "+map.headMap(102));

        System.out.println("tailMap: "+map.tailMap(102));

        System.out.println("subMap: "+map.subMap(100, 102));
    }
}


