//get 2 random numbers from console
//        write a function to calculate their product
//        print the product

package com.company;

import java.util.Scanner;

public class problem5_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your numbers: ");
        int product = calculateTheProduct(getNumbersFromConsole());
        System.out.println("Product is " + product);
    }

    public static int calculateTheProduct(int[] array) {
        return (array[0] * array[1]);
    }

    public static int[] getNumbersFromConsole() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int[] array = {number1, number2};
        return array;
    }
}