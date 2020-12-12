//Write a method to print all prime numbers less than 100.
//Call in in main

package com.company;

public class problem5_14 {

    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {
        int number, i, helper, limit = 100;
        // Print display message
        System.out.println("Here are the prime numbers between 1 and 100:");

        for (number = 2; number <= limit; number++) {
            helper = 1;

            for (i = 2; i <= number / 2; ++i) {
                if (number % i == 0) {
                    helper = 0;
                    break;
                }
            }

            if (helper == 1) {
                System.out.print(number + " ");
            }
        }
    }
}