package org.example;

import java.util.Scanner;

public class NumberSwap {
    public static void main (String args[]){
        swapWithVariable();
        swapWithOutVariable();
    }

    public static void swapWithVariable(){
        int one, two, three= 0;
        Scanner sc = new Scanner(System.in);
        one = sc.nextInt();
        two = sc.nextInt();
        System.out.println("Before Swapping : " +one +" " + two);
        three = one;
        one = two;
        two = three;
        System.out.println("After Swapping : " +one +" " + two);
    }

    public  static void swapWithOutVariable(){
        int one, two;
        Scanner sc = new Scanner(System.in);
        one = sc.nextInt();
        two = sc.nextInt();
        System.out.println("Before Swapping : " +one +" " + two);

        one = one + two;
        two = one - two;
        one = one - two;

        System.out.println("After" +
                " Swapping : " +one +" " + two);

    }
}
