package com.company;

import java.util.Scanner;

public class problem5_7 {

    public static void main(String[] args) {
        System.out.println("Please enter the year: ");
        if (checkLeapOrNot(getNumbersFromConsole())) {
            System.out.println("The year is leap.");
        } else {
            System.out.println("The year is not leap.");
        }
    }

    public static boolean checkLeapOrNot(int number) {
        return number % 4 == 0;
    }

    public static int getNumbersFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}