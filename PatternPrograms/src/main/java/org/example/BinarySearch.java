package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int KeyValue = 6;
        int l=0, h= arr.length-1;
        boolean flag = false;
        while (l<=h){
            int m = (l+h)/2;
            if(arr[m] == KeyValue){
                System.out.println("The element is found at : " +m);
                flag = true;
                break;
            }
            if(arr[m]<KeyValue){
                l=m+1;
            }
            if (arr[m]>KeyValue){
                h = m -1;
            }
        }if(flag == false){
        System.out.println("The element is not found");}
        approach2();
        parallelSort();
        sortMethod();
        sollectionsSort();
    }

    public static void approach2(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
       String a = String.valueOf(Arrays.binarySearch(arr,7));
        System.out.println(" value is :" +a);
    }

    public static void parallelSort(){
        int arr[] = {1,9,45,123,86,4,7};
        System.out.println(" value before sort is  :" +Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println(" value after sort is  :" +Arrays.toString(arr));
    }
    public static void sortMethod(){
        int arr[] = {1,9,45,123,86,4,7};
        System.out.println(" value before sort is  :" +Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(" value after sort is  :" +Arrays.toString(arr));
    }
    public static void sollectionsSort(){
        Integer arr[] = {1,9,45,123,86,4,7};
        System.out.println(" value before sort is  :" +Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(" value after sort is  :" +Arrays.toString(arr));
    }
}
