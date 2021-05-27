package com.java.collection;
import java.util.*;
public class StringTokenizerEx3
{
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Zindagi, ek, safar, hai, suhana");

        System.out.println("Next token is : " + st.nextToken(","));
    }
}

