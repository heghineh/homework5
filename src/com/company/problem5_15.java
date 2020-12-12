//initialize an array [10] with random numbers
//write a function that takes as an argument an array and returns the reversed array
//print

package com.company;

import java.util.Random;

public class problem5_15 {

    public static void main(String[] args) {
        System.out.println("Your array:");
        int[] array = initializeArray();
        printArray(array);
        System.out.println("\n\nReversed array:");
        reversedArray(array);
    }

    public static int[] initializeArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void reversedArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}