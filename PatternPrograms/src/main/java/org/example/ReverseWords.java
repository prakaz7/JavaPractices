package org.example;

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the input statement from the user
            System.out.println("Enter a statement: ");
            String statement = scanner.nextLine();

            // Split the statement into words
            String[] words = statement.split(" ");

            // Reverse each word
            for (int i = 0; i < words.length; i++) {
                words[i] = reverseWord(words[i]);
            }

            // Join the reversed words back into a statement
            String reversedStatement = "";
            for (String word : words) {
                reversedStatement += word + " ";
            }

            // Print the reversed statement
            System.out.println("Reversed statement: " + reversedStatement);
        }

        public static String reverseWord(String word) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            return reversedWord;
        }
    }
