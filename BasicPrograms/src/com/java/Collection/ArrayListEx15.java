package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
public class ArrayListEx15
{
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter product name:");
            String s=sc.next();
            product.add(s);
        }

        Iterator itr=product.iterator();
        while (itr.hasNext()) {
            System.out.println("Product name : " + itr.next());
        }
    }
}

