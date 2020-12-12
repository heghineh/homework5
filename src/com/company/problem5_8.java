//get the password from console (String)
//        write a function to check whether a string is a valid password or not
//        Password rules:
//        -- A password must have at least ten characters.
//        -- A password consists of only letters and digits.
//        -- A password must contain at least two digits.
//        print isValid or not;

package com.company;

import java.util.Scanner;

public class problem5_8 {
    static String passwordCheck;

    public static void main(String[] args) {
        System.out.println("Enter your password.");
        passwordCheck = getPasswordFromConsole();
        if (isValid(passwordCheck)) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Your password is invalid.");
        }
    }

    public static boolean checkThePasswordLength(String password) {
        return password.length() >= 10;
    }

    public static boolean checkLettersAndDigits(String password) {
        String digitsAndLetters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";

        for (int i = 0; i < password.length(); i++) {
            boolean checker = false;
            for (int j = 0; j < digitsAndLetters.length(); j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(digitsAndLetters.charAt(j)))) {
                    checker = true;
                    break;
                }
            }
            if (!checker)
                return false;
        }
        return true;
    }

    public static boolean checkDigitsNumber(String password) {
        String digits = "1234567890";
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < digits.length(); j++) {
                if (String.valueOf(password.charAt(i)).equals(String.valueOf(digits.charAt(j)))) {
                    counter++;
                    break;
                }
            }
        }
        return counter >= 2;
    }

    public static boolean isValid(String password) {
        return checkThePasswordLength(passwordCheck) &&
                checkLettersAndDigits(passwordCheck) &&
                checkDigitsNumber(passwordCheck);
    }

    public static String getPasswordFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}