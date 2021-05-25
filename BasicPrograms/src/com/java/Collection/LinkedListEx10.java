//Example of list iterator
package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx10 {
    public static void main(String args[]){
        List<String> al=new ArrayList<String>();
        al.add("Anup");
        al.add("Vijaya");
        al.add("Kulu");
        al.add(1,"Shraddha");
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}


