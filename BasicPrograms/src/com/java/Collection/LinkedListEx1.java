//Example on linkedlist
package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx1
   {
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Rinku");
        al.add("Vibha");
        al.add("Rupesh");
        al.add("Aarav");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
