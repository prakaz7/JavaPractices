package org.example;

import java.util.Scanner;

public class StringReverse {

    public static void main(String args[]){
        String actual;
        Scanner sc =  new Scanner(System.in);
        actual = sc.nextLine();
        String str[] = actual.split("");

        for (int i=str.length-1; i>=0;i--){
            System.out.print("" + str[i] + " ");
        }
        reverseOne(actual);
        ReverseTwo(actual);
        ReverseThree(actual);
        ReverseWithNoSpace(actual);
        PalindromeOrNot(actual);
    }

    public static void reverseOne(String str){
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("\n The Reverse One is : "+ buffer.reverse());

    }

    public static void ReverseTwo(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse = reverse+str.charAt(i);
        }
        System.out.println("\n The Reverse Two is : " +reverse);
    }

    public static void ReverseThree(String str){
        String reverse = "";
        char rev[] = str.toCharArray();
        for(int i = rev.length-1;i>=0;i--){
            reverse = reverse+rev[i];
        }
        System.out.print("\n The Reverse Three is : " +reverse);
    }

    public static void ReverseWithNoSpace(String str){
        String rev =str;
        char toRev[] = rev.toCharArray();
        for(int i=toRev.length-1; i>=0; i--){
            if(toRev[i]!= ' '){
                System.out.print(toRev[i] );
            }
        }
    }

    public static void PalindromeOrNot(String str){
        String rev = "";
        String org_string = str;
        char[] word = str.toCharArray();
        for(int i=word.length-1; i>=0; i--){
            rev = rev+word[i];
        }
        System.out.println("The reversed Keyword is : " +rev);
        if (org_string.equals(rev)){
            System.out.println("The String is a Palindrome");
        }else {
            System.out.println("The String is NOT a Palindrome");
        }
    }
}
