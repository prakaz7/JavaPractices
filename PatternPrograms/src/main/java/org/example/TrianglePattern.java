package org.example;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String args[]){
        System.out.println("Inside Main -- Enter the N value : ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        pattern(N);
        pattern2(N);
    }

    public static void pattern(int n){
        //Initialize outer loop
        for (int i = 0; i<=n; i++){
            //initialize inner loop
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
            System.out.println();
        }
    }

    public static void pattern2(int n){
        System.out.println();
        System.out.println();
        //Initialize outer loop
        for (int i = 0; i<=n; i++){
            //initialize inner loop
            for (int j = i; j<=n; j++){
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
        }
    }


}
