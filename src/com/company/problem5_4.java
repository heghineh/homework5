//get 3 numbers from console
//        write a function to find the smallest number among the three numbers.
//        print the smallest number

package com.company;

import java.util.Scanner;

public class problem5_4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your numbers: ");
        int minimum = findTheMinimum(getNumbersFromConsole());
        System.out.println("The smallest number is " + minimum);
    }

    public static int findTheMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] getNumbersFromConsole() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int[] array = {number1, number2, number3};
        return array;
    }
}