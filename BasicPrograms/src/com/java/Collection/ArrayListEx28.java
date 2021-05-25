package com.mkpits.java.collection;
import java.util.*;
public class ArrayListEx28
{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Vibha");
        al.add("Vaibhav");
        al.add("Gourav");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Banku");
        al2.add("Rinku");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

