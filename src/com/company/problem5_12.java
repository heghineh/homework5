package com.company;

import java.util.Random;

public class problem5_12 {
    public static void main(String[] args) {
        int array[] = initializeTheArray();
        printTheArray(initializeTheArray());
        System.out.println();

    }

    public static int[] initializeTheArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] sortInAscOrder(int[] array) {
        int min = array[0];
        int helper = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    helper = array[i];
                    array[i] = array[j];
                    array[j] = helper;
                }
            }
        }
        return array;
    }

    public static void printTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
