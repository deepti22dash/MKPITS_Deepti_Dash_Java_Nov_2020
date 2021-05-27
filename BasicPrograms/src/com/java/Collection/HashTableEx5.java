package com.java.collection;
import java.util.*;

class Bookss {
    int id;
    String name,author,publisher;
    int quantity;
    public Bookss(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashTableEx5 {
    public static void main(String[] args) {
        Map<Integer,Bookss> map=new Hashtable<Integer,Bookss>();
        Bookss b1=new Bookss(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Bookss b2=new Bookss(102,"Core Java","E Balaguru Samy","Mc Graw Hill",4);
        Bookss b3=new Bookss(103,"Operating System","Galvin","Wiley",6);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

       for(Map.Entry<Integer, Bookss> entry:map.entrySet()){

           int key=entry.getKey();
            Bookss b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}

