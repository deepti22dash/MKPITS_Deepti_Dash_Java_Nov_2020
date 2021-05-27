package com.java.collection;
import java.util.*;
public class LinkedHashmapEx1
{
    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put( 78,"Asha");
        hm.put(97,"Vibha");
        hm.put(54,"Rakesh");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

