package com.java.collection;
import java.util.*;
class Product implements Comparable<Product>{
    int id;
    String name;
    int price;
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
    public int compareTo(Product pr)
    {
        if(id>pr.id){
            return 1;
        }else if(id<pr.id)
        {
            return -1;
        }else
        {
            return 0;
        }
    }
}
public class ProrityQueueEx4Product {
    public static void main(String[] args) {
        Queue<Product> queue=new PriorityQueue<Product>();

        Product b1=new Product(299,"HairDryer", 500);
        Product b2=new Product(978,"Mirror",300);
        Product b3=new Product(365,"Scisor",70);

        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");

        for(Product p:queue)
        {
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        queue.remove();
        System.out.println("After removing one product from  record:");
        for(Product p :queue){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
