package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 7, 6, 6, 7, 4, 9, 5};
        Set<Integer> set = new HashSet<>();

        for (int i =0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for (Integer elements : set) {
            System.out.println(elements);
        }
    }


    public static void approach2(){
        int[] arr = {4, 5, 5, 7, 6, 6, 7, 4, 9, 5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                entry.getKey();
            }
        }
    }
}
