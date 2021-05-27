package com.java.collection;
import  java.util.*;
public class StringTokenizerEx4
{
    public static void main(String[] args) {
        String str="I love INDIA ";
        String arr[]=new String[4];
        StringTokenizer st=new StringTokenizer(str," ");
        int i=0;
        while (st.hasMoreTokens())
        {

            arr[i]=st.nextToken();
            i=i+1;
        }
        for( i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}


