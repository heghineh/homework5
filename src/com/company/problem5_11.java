//Create int array [10]
//write a function that takes as a parameter array and initializes that array with random numbers
//write a function that takes as a parameter array and prints it
//Call them in main.

package com.company;

import java.util.Random;

public class problem5_11 {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Here is your array");
        printArray(initializeArray(array));
    }

    public static int[] initializeArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}