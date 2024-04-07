package org.example;

import java.util.Scanner;

public class PrintOdddEvenNumbers {
    public static void main(String[] args) {
        int odd=0, even =0;

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<n; i++){
            if(arr[i]%2==0){
                System.out.println("even numbers: " +arr[i]);
                even++;
            }
            else {
                System.out.println("odd numbers: " +arr[i]);
                odd++;
            }
        }
        System.out.println("Odd count: "+odd);
        System.out.println("even count: "+even);
    }
}
