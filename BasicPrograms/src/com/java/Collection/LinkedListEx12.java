package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx12
{
    public static void main(String args[]){
        String[] array={"cumin", "fenugreek"," salt", "sugar"," peas"};
        System.out.println("Printing Array: "+Arrays.toString(array));
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        System.out.println("Printing List: "+list);

    }
}

