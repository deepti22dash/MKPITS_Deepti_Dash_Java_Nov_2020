package com.java.collection;
import java.util.*;
public class TreesetEx3
{
    public static void main(String args[]){
        TreeSet<Integer> tset=new TreeSet<Integer>();
        tset.add(248);
        tset.add(686);
        tset.add(124);
        tset.add(915);
        System.out.println("Highest Value: "+tset.pollFirst());
        System.out.println("Lowest Value: "+tset.pollLast());
    }
}

