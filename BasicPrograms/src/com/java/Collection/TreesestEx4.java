package com.java.collection;
import java.util.*;
public class TreesestEx4
{
    public static void main(String args[]){
        TreeSet<String> trset=new TreeSet<String>();
        trset.add("Z");
        trset.add("Y");
        trset.add("X");
        trset.add("V");
        trset.add("U");
        System.out.println("Initial Set: "+trset);

        System.out.println("Reverse Set: "+trset.descendingSet());

        System.out.println("Head Set: "+trset.headSet("C", true));

        System.out.println("SubSet: "+trset.subSet("A", false, "E", true));

        System.out.println("TailSet: "+trset.tailSet("C", false));
    }
}

