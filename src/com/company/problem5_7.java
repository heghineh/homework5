//get the year from console (int)
//        write a function to check whether a year entered by the user is a leap year or not.
//        print

package com.company;

import java.util.Scanner;

public class problem5_7 {

    public static void main(String[] args) {
        System.out.println("Please enter the year: ");
        if (checkLeapOrNot(getNumberFromConsole())) {
            System.out.println("The year is leap.");
        } else {
            System.out.println("The year is not leap.");
        }
    }

    public static boolean checkLeapOrNot(int number) {
        return number % 4 == 0;
    }

    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}