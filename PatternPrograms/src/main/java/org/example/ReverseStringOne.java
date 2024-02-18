package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseStringOne {
    public static void main(String args[]) {
        String sentance = "This is the String to reverse";
        StringBuilder str2 = new StringBuilder();
        str2.append(sentance);
        System.out.println(str2.reverse());

        System.out.println("To Reverse a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
        reverseNoSpace(str);
        reverseNoSpace1(str);
        reverseWithTwoVariables();
    }

    public static void reverse(String str){

        String text = str;
        char[] character = text.toCharArray();
        for (int i = character.length-1; i>=0; i--){
            System.out.print(character[i]);
        }
        System.out.println( );
    }

    public static void reverseNoSpace(String str){
        String newS = str;
        char[] chars = newS.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            if(chars[i] != ' ')
            System.out.print(chars[i]);
        }
    }

    public  static  void reverseNoSpace1(String str){
        System.out.println( );
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String split[] = word.split(" ");
        for (int i=split.length-1; i>0; i--){
            System.out.print(split[i]);
        }
    }

    public static void reverseWithTwoVariables(){
        String Root, toReverse="";
        System.out.println("The Statement is : ");
        Scanner scan = new Scanner(System.in);
        Root = scan.nextLine();
        int len = Root.length();
        for (int i = len-1;i>=0;i--){
            toReverse = toReverse+Root.charAt(i);
        }
        System.out.println(toReverse);
    }

}
