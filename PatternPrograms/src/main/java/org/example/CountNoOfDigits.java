package org.example;

import java.util.Scanner;

public class CountNoOfDigits {

    public static void main(String[] args) {
        long n = 345289467;
        System.out.print("Number of digits : "
                + countDigit(n));
        //int[] array = int[1,2,3,4,5,6];
        int number = 12345678;
        int count =0;

        while (number!=0){
            number = number/10;
            count++;
        }
        System.out.println("The total number of digits is : " +count);
        countDigit();
    }

    public static void countDigit(){
        //System.out.println("Enter the number : ");
        //Scanner sc = new Scanner(System.in);
        int[] value = new int[]{1,5,6,9,00,77,8,99,6};
        int count = 0;
        for (int i=0; i< value.length;i++){
            ++count;
        }
        System.out.println("The count of numbers in the array is : " +count);
    }

    public static int countDigit(long N){
        if (N/10==0){
            return 1;
        }else {
            return 1+countDigit(N/10);
        }
    }
}
