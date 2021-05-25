package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
import java.util.Scanner;

public class ArrayListEx24
{
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter product name");
            String sn=sc.next();
            product.add(sn);
        }
        product.forEach(x -> {System.out.println(x);});
    }
}

