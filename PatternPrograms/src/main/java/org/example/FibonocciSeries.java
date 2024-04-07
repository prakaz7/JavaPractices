package org.example;

import java.util.Scanner;

public class FibonocciSeries {
    public static void main(String[] args) {
        int n1 =0, n2 = 1, sum =0;
        System.out.println(n1 + " " +n2);
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n;i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
