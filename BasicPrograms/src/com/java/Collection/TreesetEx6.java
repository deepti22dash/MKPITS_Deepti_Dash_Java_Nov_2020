package com.java.collection;
import java.util.*;
class Book111 implements Comparable<Book>{
    int id;
    String name,author,publisher;
    int quantity;
    public Book111(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
public class TreesetEx6 {
    public static void main(String[] args) {
        Set<Book111> set=new TreeSet<Book111>();
        Book111 b1=new Book111(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book111 b2=new Book111(233,"Operating System","Galvin","Wiley",6);
        Book111 b3=new Book111(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for(Book111 b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}

