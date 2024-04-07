package org.example;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class REmoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,4,5,6};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i =0; i< arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("The array is: " +set);
        approach1();
        approach2();
        approach3();
    }

    public static void approach1(){
        int arr[] = {1,2,4,3,2,4,5,6};
        int m=0;
        for (int i =0; i<arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        int f[] = new int[m+1];
        for (int i=0;i< arr.length;i++){
            f[arr[i]]++;
        }
        for (int i=0;i<m+1;i++){
            if (f[i]>0){
                System.out.print(" Element :" + i);
            }
        }

    }

    public static void approach2(){
        int arr[] = {1,2,4,3,2,4,5,6};
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int a:arr){
            if(map.get(a)==null){
                System.out.println("Element is :" +a);
                map.put(a,true);
            }
        }
    }

    public static void approach3(){
        String arr[] = {"Hi","Hi","Hello","Hello","Hello"};
        LinkedHashSet<String > set = new LinkedHashSet<>();
        for (int i =0; i< arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("The array is: " +set);
    }
}
