package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx14
 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter product name :");
            String str=sc.next();
            product.add(str);
        }
        System.out.println(product);
    }
}

