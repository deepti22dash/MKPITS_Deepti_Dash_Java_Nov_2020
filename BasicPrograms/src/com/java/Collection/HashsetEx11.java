package com.java.collection;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
public class HashsetEx11
 {
    public static void main(String[] args)
    {

        HashSet<String> flower_set = new HashSet<>();

        flower_set.add("tulip");
        flower_set.add("rose");
        flower_set.add("orchid");
        flower_set.add("marie-gold");

        ArrayList<String> flower_array = new ArrayList<>(flower_set);
        System.out.println("Elements of flower Arraylist are :");
        System.out.println(flower_array);
        System.out.print("Element at index 0 is : " + flower_array.get(0) + " ");
    }
}


