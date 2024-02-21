package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CountnumberOfWordsinString {
    public static void main(String[] args) {
        String sentance= "";
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        sentance = sc.nextLine();

        String[] str = sentance.split(" ");
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for (int i =0; i<str.length;i++){
            if(map.containsKey(str[i]))
            {
                int count = map.get(str[i]);
                map.put(str[i], count +1 );
            }
            else {
                map.put(str[i], 1);
            }
        }
        System.out.println(map);

        countTheCharacters();
    }

    public  static  void countTheCharacters(){
        String str = "Hi hi Hello Hello This is jus is the test";
        int count = 0 ;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
                System.out.println("count is " + count);
            }
        }
        System.out.println("count is " + count);

    }


}
