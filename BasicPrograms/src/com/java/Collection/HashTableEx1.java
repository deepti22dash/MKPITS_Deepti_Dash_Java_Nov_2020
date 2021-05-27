//Example of Hashtable
package com.java.collection;
import java.util.*;
public class HashTableEx1
{
    public static void main(String args[]){
        Hashtable<Integer,String> htb=new Hashtable<Integer,String>();

        htb.put(100,"Rishabh");
        htb.put(102,"Rounak");
        htb.put(101,"Rupesh");
        htb.put(103,"Roshan");

        for(Map.Entry m:htb.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
