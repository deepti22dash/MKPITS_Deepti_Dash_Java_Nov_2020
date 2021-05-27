package com.java.collection;
import java.util.*;

class Book123 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book123(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashMapEx4 {
    public static void main(String[] args) {

        Map<Integer,Book123> map=new LinkedHashMap<Integer,Book123>();

        Book123 b1=new Book123(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book123 b2=new Book123(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book123 b3=new Book123(103,"Operating System","Galvin","Wiley",6);

        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        for(Map.Entry<Integer, Book123> entry:map.entrySet()){
            int key=entry.getKey();
            Book123 b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}


