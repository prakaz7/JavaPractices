package org.example;

import java.util.Scanner;

public class Largestof3Numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        a=sc.nextInt();
        System.out.println("Enter Second Number : " );
        b=sc.nextInt();
        System.out.println("Enter Third Number : " );
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is : " +a);
        } else if (b>a && b>c) {
            System.out.println("The largest number is : " +b);
        }else {
            System.out.println("The largest number is : " +c);
        }
        approach3();
        approach2();

    }

    public static void approach2(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        a=sc.nextInt();
        System.out.println("Enter Second Number : " );
        b=sc.nextInt();
        //System.out.println("Enter Third Number : " );
        //c=sc.nextInt();

        int c = a>b?a:b;
        System.out.println("The largest number is : " +c);
    }
    public static void approach3(){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : " );
        a=sc.nextInt();
        System.out.println("Enter Second Number : " );
        b=sc.nextInt();
        System.out.println("Enter Third Number : " );
        c=sc.nextInt();

        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("The largest is : " +largest);
    }

}
