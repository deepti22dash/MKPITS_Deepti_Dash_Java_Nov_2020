//Example of arraylist using get() and set()

package com.mkpits.java.collection;

import java.util.*;
public class ArrayListEx6 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        System.out.println("Returning element: " + al.get(1));

        al.set(1, "Dates");
        for (String fruit : al)
            System.out.println(fruit);
        {
        }
    }
}