package com.company;

import java.util.Random;

public class problem5_11 {
    public static void main(String[] args) {
        printTheArray(initializeTheArray());
    }

    public static int[] initializeTheArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}