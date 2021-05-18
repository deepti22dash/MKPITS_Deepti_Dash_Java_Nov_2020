package com.java.awt.mkpits;
import java.util.Scanner;
public class PatternEx23
{
    public static void main(String[] args)
    {
        int alpha = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alpha + j) + " ");
            }
            System.out.println();
        }
    }
}



