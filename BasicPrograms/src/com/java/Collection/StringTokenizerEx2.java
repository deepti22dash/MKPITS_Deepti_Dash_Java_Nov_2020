package com.java.collection;
import java.util.StringTokenizer;
public class StringTokenizerEx2
{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("My .Name .Is .Vibha .Dash",".");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

