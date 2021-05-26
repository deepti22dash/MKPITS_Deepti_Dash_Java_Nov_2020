package com.java.collection;
import java.util.*;
public class TreesetEx1
{
    public static void main(String args[]){
        TreeSet<String> al=new TreeSet<String>();
        al.add("Rinku");
        al.add("Vibha");
        al.add("Rishi");
        al.add("Anju");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

