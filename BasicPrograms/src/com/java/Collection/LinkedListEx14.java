package com.mkpits.java.collection;
import java.util.*;

public class LinkedListEx14
{
    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("Family");
        names.add("Is");
        names.add("Everything");

         ListIterator<String> listitr = names.listIterator();
        System.out.println("Forward Direction Iteration:");
        while (listitr.hasNext()) {
            System.out.println(listitr.next());
        }
        System.out.println("Backward Direction Iteration:");
        while (listitr.hasPrevious()) {
            System.out.println(listitr.previous());
        }
    }
}
