package com.company;

import java.util.Scanner;

public class problem5_6 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your text: ");
        System.out.println(countWords(getStringFromConsole()));
    }

    public static int countWords(String text) {
        String[] array = new String[text.length()];
        int counter = 1;
        for (int i = 1; i < text.length(); i++) {
            array[i] = String.valueOf(text.charAt(i));
            if (array[i].equals(" ") && !(array[i - 1].equals(" "))) {
                counter++;
            }
        }
        return counter;
    }

    public static String getStringFromConsole() {
        return scanner.nextLine();
    }
}