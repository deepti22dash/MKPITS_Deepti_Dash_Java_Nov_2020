package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx2
{
    public static void main(String args[]){
        LinkedList<String> l1=new LinkedList<String>();
        System.out.println("Initial list of elements: "+l1);
        l1.add("Rinku");
        l1.add("Vibha");
        l1.add("Arnav");
        System.out.println("After invoking add(E e) method: "+l1);
        l1.add(1, "Gourav");
        System.out.println("After invoking add(int index, E element) method: "+l1);

        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Shruti");
        ll2.add("Aarav");
        l1.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+l1);

        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("Chunu");
        ll3.add("Shiva");
        l1.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+l1);
        l1.addFirst("Geeta");
        System.out.println("After invoking addFirst(E e) method: "+l1);
        l1.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: "+l1);

    }
}


