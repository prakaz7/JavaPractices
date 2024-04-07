package org.example;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int a, count=0;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();

        if (a>1){
            for(int i=1;i<=a;i++){
                if(a%i==0)
                    ++count;
            }
                if(count==2){
                    System.out.println("The given number is a Prime number");
                }else{
                    System.out.println("The given number is NOT a Prime number ");
                }
            } else {
            System.out.println("The given number is NOT a Prime number ");
        }
        prime();
    }

    public static void prime(){
        int count =0;
        for (int i =0; i<=20; i++){
            if(i>1){
                for(int j=1; j<=i; j++){
                    if (i%j == 0)
                        count ++;
                }
                if (count ==2){
                    System.out.println("Number is Prime No");
                }else {
                    System.out.println("Number is Prime Not No");
                }
            }else {
                System.out.println("Number is Not Prime No");
            }
        }
    }

}
