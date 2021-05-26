package com.java.collection;
import java.io.*;
import java.util.*;
public class HassetEx9
 {

    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("HELLLO");
        hs.add("HI");
        hs.add("THERE");
        hs.add("FROM");
        hs.add("PLANET");
        hs.add("EARTH");

        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();
    }
}


