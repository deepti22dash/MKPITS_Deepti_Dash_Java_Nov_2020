//Examples on Matrix multiplication
package com.java.awt.mkpits;

public class Ex13 {
    public static void main(String args[]){
        int a[][]={{9,6,2},{2,5,8},{6,3,5}};
        int b[][]={{4,1,5},{7,2,6},{2,4,7}};

        int c[][]=new int[3][3];

       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }}


