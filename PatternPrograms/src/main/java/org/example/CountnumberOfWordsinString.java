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
        reverseWordsOnThePlace();
        reverseMethod();
    }

    public  static  void countTheCharacters(){
        String str = "Hi hi Hello Hello This is jus is the test";
        int count = 0 ;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
            //System.out.println("count is " + count);
        }
        System.out.println("count is " + count);

    }


    public static void reverseWordsOnThePlace(){
        String str = "This is Java Program";
        String word[] = str.split(" ");
        String revWord ="";
        for(int i=0;i< word.length;i++){
            String words = word[i];
            String reverseWord = "";
            for (int j=words.length()-1; j>=0; j--){
                reverseWord = reverseWord+words.charAt(j);
            }
            revWord = revWord+reverseWord+ " ";
        }
        System.out.println("MEthoda 3 is : "+ revWord);
    }

    public static void reverseMethod(){
        String word[] = new String[]{" The Java   Programming "};
        StringBuilder sb = new StringBuilder();
        for (int i = word.length-1; i>=0; i--){
            sb.append(word[i]);
            sb.append(" +");
        }
        System.out.println("MEthod 4");
        System.out.println(sb.toString().trim());

    }




}
