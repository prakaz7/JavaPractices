package org.example;

import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
        int num = 23345;
        int sum =0;
        while (num > 0) {

            sum = sum+(num%10);
            num=num/10;
        }
        System.out.println("Sum is : " +sum);
        add();
    }

    public static void add(){
        int sum =0, n;
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();
        int num[] = new int[n];

        for (int i=0; i<n; i++){
           num[i] = sc.nextInt();
        }
        for (int i =0; i<n; i++){
            sum = sum +num[i];
        }
        System.out.println("The Sum is :" +sum);

    }
}
