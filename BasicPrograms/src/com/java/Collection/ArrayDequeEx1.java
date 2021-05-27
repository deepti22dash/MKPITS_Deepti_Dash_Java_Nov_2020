package com.java.collection;
import java.util.*;
public class ArrayDequeEx1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Rani");
        deque.add("Vishal");
        deque.add("Ankit");
        for  (String str : deque) {
            System.out.println(str);
        }
    }
}

