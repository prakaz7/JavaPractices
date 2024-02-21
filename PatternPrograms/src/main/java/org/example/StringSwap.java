package org.example;

import java.util.Scanner;

public class StringSwap {
    public static void main(String args[]){
        String str1, str2 ="";
        System.out.println("Enter the String 1 : " );
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        System.out.println("Enter the String 2 : " );
        str2 = sc.nextLine();
        stringSwapWithVariable(str1,str2);
        stringSwapWithOutVariable(str1,str2);
    }

    public static void stringSwapWithVariable(String str1, String str2){

        System.out.println("Before swapping the String : " + str1 + " " + str2);
        String str3 = "";
        str3 = str1;
        str1 = str2;
        str2 = str3;
        System.out.println("After swapping the String : " + str1 + " " + str2);
    }

    public static void stringSwapWithOutVariable(String str1, String str2){
        System.out.println("Before swapping the String : " + str1 + " " + str2);
        str1 = str1+str2;
        System.out.println("Concat the String : " + str1);
        str2 = str1.substring(0,(str1.length()-str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("After swapping the String : " + str1 + " " + str2);
    }
}
