package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuraneofCharacters {
    public static void main(String[] args) {
        String s = "";
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i =0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), count +1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println("The count and occurance :" + map);
        System.out.println("" );
        System.out.println("");

        for (int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))!=0){
                System.out.print(s.charAt(i));
                System.out.print(map.get(s.charAt(i))+ " ");
                map.put(s.charAt(i), 0);

            }
        }
        method();
    }

    public static void method(){
        String str = "java code";
        char[] c = str.toCharArray();
        char temp;
        for(int i=0;i<c.length;i++){
            for (int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j] = temp;
                }
            }
        }

        System.out.println(new String(c));
    }
}
