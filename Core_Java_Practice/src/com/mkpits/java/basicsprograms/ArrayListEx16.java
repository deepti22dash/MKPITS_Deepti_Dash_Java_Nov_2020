package com.mkpits.java.collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import  java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx16
{
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("Enter product name:");
            String s=sc.next();
            product.add(s);
        }
        for(String str : product) {
            System.out.println("Product name " + str);
        }
    }
}

