package com.java.collection;
import java.util.*;
public class ArrayDequeEx2
{
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("Anup");
        deque.offer("vinay");
        deque.add("Salu");
        deque.offerFirst("Bhola");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}


