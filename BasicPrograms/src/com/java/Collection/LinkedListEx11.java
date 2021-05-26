package com.mkpits.java.collection;
import java.util.*;
public class LinkedListEx11 {
    public static void main(String[] args) {
        List<String> ProductList= new ArrayList<String>();
        ProductList.add(" oven");
        ProductList.add("mirror");
        ProductList.add("hammer");
        String[] array= ProductList.toArray(new String[ProductList.size()]);
        System.out.println( "print array; "+Arrays.toString(array));
        System.out.println("Printing list "+ProductList);

    }
}
