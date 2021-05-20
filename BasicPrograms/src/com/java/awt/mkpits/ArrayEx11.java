package com.java.awt.mkpits;

public class ArrayEx11  {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==4&&j==4){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}

