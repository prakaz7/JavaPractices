package DailyPractice;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        String string = "";
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        //Print the received string.
        System.out.println("The Entered String is :"+string);

        //String Reverse
        for (int i = string.length()-1; i>=0; i--){
            System.out.print(string.charAt(i));
        }
        System.out.println();
        stringReversePlace();
    }

    public static void stringReversePlace(){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String reverseWord = "";
        String[] str =string.split(" ");
        System.out.println("CheckS");
        for (int i =0; i < str.length; i++){
            String word = str[i];
            String rev = "";
            for (int j=word.length()-1; j>=0; j--){
                rev = rev + word.charAt(j);
            }
            reverseWord = reverseWord + rev + " ";
        }
        System.out.println("Reveresed string on Method 2 is : " + reverseWord);
    }
}
