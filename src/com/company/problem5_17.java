//write a function that takes as an argument int number and calculates its factorial
//        print

package com.company;

import java.util.Scanner;

public class problem5_17 {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = inputFromConsole();
        int factorial = countTheFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static int countTheFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        if (number == 0) {
            factorial = 1;
        }
        return factorial;
    }

    public static int inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}