//Palindrome Check
//A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//Write a boolean returning method that detects if a string is a palindrome.
//Hint: Use word.charAt(i) to get the character at position i.

package com.company;

import java.util.Scanner;

public class problem5_16 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter your text: ");
        checkIfPalindrome(getTextFromConsole());
    }

    public static String getTextFromConsole() {
        String text = scanner.nextLine();
        return text;
    }

    public static void checkIfPalindrome(String text) {

        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);

            if (text.equals(reverse)) {
                System.out.println("The text is palindrome.");
                return;
            }
        }
        System.out.println("The text is not palindrome.");
    }
}