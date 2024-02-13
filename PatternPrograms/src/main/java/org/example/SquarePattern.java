package org.example;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String args[]){
        System.out.println("Enter the Count : ");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        pattern(n);
    }

    public static void pattern(int n){
        //initiating variables
        for (int i = 0; i<n; i++)
        {
            for (int j=0;j<n;j++){
                if(i==0 || j ==0 || i == n-1 || j ==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
