package org.example;

import java.util.Scanner;

public class SameNumberTrianglePattern {
    public static void main(String args[]){

        System.out.println("Inside Main -- enter count number : ");
        Scanner count = new Scanner(System.in);
        int n = count.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        int j;
        for (int i=1;i<=n;i++){
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
                for (j =1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }

