package com.java.collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.*;
public class HashsetEx13

 {
    public static void main(String[] args)
    {
        ArrayList<String> hs13 = new ArrayList<>();

        hs13.add("java");
        hs13.add("python");
        hs13.add("C");
        hs13.add("C++");
        hs13.add("Dotnet");

        HashSet<String> hashSet = new HashSet<>(hs13);

        for (String value : hashSet) {
            System.out.println(value);
        }
    }
}



