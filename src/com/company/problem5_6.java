//get a sentence from console
//        write a function to count all words in a string.
//        print count;

package com.company;

import java.util.Scanner;

public class problem5_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your text: ");
        System.out.println("Number of words: " + countWords(getStringFromConsole()));
    }

    public static int countWords(String text) {
        String[] array = new String[text.length()];
        int counter = 1;
        for (int i = 0; i < text.length(); i++) {
            array[i] = String.valueOf(text.charAt(i));

            if (i > 0 && array[i].equals(" ") && !(array[i - 1].equals(" "))) {
                counter++;
            }
        }
        if (array[text.length() - 1].equals(" ")) {
            counter--;
        }
        return counter;
    }

    public static String getStringFromConsole() {
        return scanner.nextLine();
    }
}