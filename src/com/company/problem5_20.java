//( USE  FUNCTIONS FOR ROTATION!! )
//        Write a function (takes a number N as input from console) creates N x N matrix
//        And initializes it with random numbers in range 27 - 78
//        print it
//        Display a menu like this
//        ———————- MENU —————-
//        Press 1 For rotating 90*
//        Press 2 For rotating 180*
//        Press 3 For rotating 270*
//        Press 4 to Exit
//        ————————————————
//        ( USE  FUNCTIONS FOR ROTATION!! )
//        After each operation program should show the menu… !!!!!!!!!
//        DO NOT EXIT THE PROGRAM IF THE INPUT IS NOT 4 !!!!!!!!!

package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem5_20 {
    static Scanner scanner = new Scanner(System.in);
    static int[][] matrix;

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        matrix = initializeMatrix(inputNumberFromConsole());
        System.out.println("Here is your matrix:");
        printMatrix(matrix);
        menuOn();
    }

    public static void menuOn() {
        boolean repeat = true;
        do {
            repeat = true;
            System.out.println("\n----- MENU -----\nPress 1 for rotating 90 degree." +
                    "\nPress 2 for rotating 180 degree\nPress 3 for rotating 270 degree.\nPress 4 to exit.");
            System.out.print("\nEnter here ---> ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("90 degree clockwise rotation.\n");
                    rotateTo90(matrix);
                    repeat = false;
                }
                case 2 -> {
                    System.out.println("180 degree clockwise rotation.\n");
                    rotateTo180(matrix);
                    repeat = false;
                }
                case 3 -> {
                    System.out.println("270 degree clockwise rotation.\n");
                    rotateTo270(matrix);
                    repeat = false;
                }
                case 4 -> {
                    System.out.println("Exit.");
                }
                default -> {
                    System.out.println("Invalid number. Please try again.");
                    repeat = false;
                }
            }
        } while (!repeat);
    }

    public static int inputNumberFromConsole() {
        return scanner.nextInt();
    }

    public static int[][] initializeMatrix(int number) {
        int[][] matrix = new int[number][number];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(51) + 27;
            }
        }
        return matrix;
    }

    public static void rotateTo90(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[matrix.length - 1 - j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateTo180(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[matrix.length - i - 1][matrix.length - 1 - j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateTo270(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][matrix.length - 1 - i] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}