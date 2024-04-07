package org.example;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a!=0){
            rev = rev*10+a%10;
            a=a/10;
        }
        System.out.println("The reversal number is : "+rev);
        if (a==rev){
            System.out.println("The Number is palindrome");
        }else{
            System.out.println("The Number is Not a palindrome");
        }
        reverseNum();
    }

    public static void reverseNum(){
        String rev ="" ;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        rev= rev+ sb.reverse();
        System.out.println("The number is : " +rev);
    }
}
