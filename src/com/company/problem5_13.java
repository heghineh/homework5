//initialize an array [10] with random numbers
//write a function that takes as an argument an array and returns the array sorted in desc order
//print

package com.company;

import java.util.Random;

public class problem5_13 {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Here is your array:");
        int[] initArray = initializeArray(array);
        printArray(initArray);
        System.out.println("\n\nHere is the array sorted in desc order:");
        printArray(sortToDesc(initArray));
    }

    public static int[] initializeArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] sortToDesc(int[] array) {
        int helper = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    helper = array[i];
                    array[i] = array[j];
                    array[j] = helper;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}