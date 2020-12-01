package com.company;

public class problem5_14 {
    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {
        boolean isPrime;
        int number = 1;
        for (int i = 2; i < 100; i++) {
            if (number % i != 0) {
                System.out.println(number);
            } else {
                break;
            }
            number++;
        }
    }
}


