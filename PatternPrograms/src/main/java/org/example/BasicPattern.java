package org.example;

import java.util.Scanner;

public class BasicPattern {
        public static void main(String args[]){
            System.out.println("Inside Main -- Enter the N value : ");
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            pattern(N);
        }

        public static void pattern(int n){
            //Initialize outer loop
            for (int i = 0; i<n; i++){
                //initialize inner loop
                for (int j = 0; j< n; j++){
                    System.out.print("*");
                }
                System.out.print(" ");
                System.out.println();
            }
        }
    }


