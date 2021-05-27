package com.java.collection;
import java.util.*;
class Book555 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book555(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class  HashMapEx6 {
    public static void main(String[] args) {

        Map<Integer,Book555> map=new HashMap<Integer,Book555>();

        Book555 b1=new Book555(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book555 b2=new Book555(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book555 b3=new Book555(103,"Operating System","Galvin","Wiley",6);

        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for(Map.Entry<Integer, Book555> entry:map.entrySet())
        {
            int key=entry.getKey();
            Book555 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}

