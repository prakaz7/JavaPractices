package org.example;

import java.util.Scanner;

public class CountOfOddandEvenNumbers {
    public static void main(String[] args) {
        int evenCount =0, oddCount =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.println("The array of numbers to check is : "+arr[i]);
        }
        for (int i=0;i<n;i++){
            if (arr[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("The Odd count is : " +oddCount);
        System.out.println("The Even count is : " +evenCount);
        noArray();
    }

    public static void noArray(){
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        int num = 1234567890;
        int evenCnt=0, oddCnt =0;
        while(num>0){
            int reminder = num%10;
            if (reminder % 2 ==0){
                evenCnt++;
            }else {
                oddCnt++;
            }
            num= num/10;
        }
        System.out.println("The odd count is " + oddCnt + "\n The even count is : " +evenCnt);
    }
}
