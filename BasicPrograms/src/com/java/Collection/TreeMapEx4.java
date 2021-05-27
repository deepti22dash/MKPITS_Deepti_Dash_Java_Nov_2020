package com.java.collection;
import java.util.*;

class Books {
    int id;
    String name,author,publisher;
    int quantity;
    public Books(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class TreeMapEx4 {
    public static void main(String[] args) {

        Map<Integer,Books> map=new TreeMap<Integer,Books>();

        Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Books b3=new Books(103,"Operating System","Galvin","Wiley",6);

        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        for(Map.Entry<Integer, Books> entry:map.entrySet()){
            int key=entry.getKey();
            Books b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}

