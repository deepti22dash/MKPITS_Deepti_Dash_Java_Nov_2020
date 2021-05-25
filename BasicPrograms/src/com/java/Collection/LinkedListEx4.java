//Traversing the list of elements in reverse order

package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx4
{
    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Reena");
        ll.add("Vivek");
        ll.add("Animesh");
        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}


