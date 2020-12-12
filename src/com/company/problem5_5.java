//get a string from console
//        write a function to display the middle character of a string.

package com.company;

import java.util.Scanner;

public class problem5_5 {
    static Scanner scanner = new Scanner(System.in);
    static int midChar;

    public static void main(String[] args) {
        System.out.println("Please enter your text: ");
        String middleChar = Character.toString(findTheMidCharacter(getStringFromConsole()));
        if (midChar == 0) {
            System.out.println("There is no middle character");
        } else {
            System.out.println("The middle character is " + "'" + middleChar + "'.");
        }
    }

    public static char findTheMidCharacter(String text) {

        if (text.length() % 2 != 0) {
            midChar = text.length() / 2;
        } else {
            midChar = 0;
        }
        return text.charAt(midChar);
    }

    public static String getStringFromConsole() {
        return scanner.nextLine();
    }
}