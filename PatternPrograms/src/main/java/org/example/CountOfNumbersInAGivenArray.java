package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfNumbersInAGivenArray {

    public static void main(String[] args) {
        int arr[] = {10,10,20,30,40,5,10,20,30,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("The Key and value pairs are as folllows : " + entry.getKey() + "   " + entry.getValue());
        }
        System.out.println("the counts are : " +map);
    }
}
