package com.java.collection;
import java.util.StringTokenizer;
public class StringTokenizerEx1
{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("Zindagi na milegi dobara"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}




