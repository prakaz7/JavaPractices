package org.example;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,10,4};
        int search = 0;
        boolean flag = false;
        for (int a:arr){
            if (search == a){
                System.out.println("Element found");
                flag = true;
            }
        }if(flag == false){
            System.out.println("Element not found");
        }
    }
}
