package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementinArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i =0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate element is found: "+a[i]);
                }
            }
        }
        approach2();
    }

    public static void approach2(){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0; i<=n;i++){
            a[i] = sc.nextInt();
            System.out.println("To be entered are :" +a[i]);
        }
        HashSet<Integer> set = new HashSet();
        boolean flag = false;
        for (int val:a){
            if(set.add(val)==false){
                System.out.println("Duplicate element found : " +val);
                flag = true;
            }
        }
        if (flag = false){
            System.out.println("Duplicate element is not found");
        }
    }
}
