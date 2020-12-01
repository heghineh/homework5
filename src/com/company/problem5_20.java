package com.company;

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

import java.util.Random;
import java.util.Scanner;

public class problem5_20 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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

    public static int[][] menuOnn(int[][] matrix) {
        boolean repeat;
        do {
            repeat = true;
            System.out.print("\nEnter here ---> ");
            int number = scanner.nextInt();

            switch (number) {
                case 1: {
                    System.out.println("90 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[matrix.length - 1 - j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.println("180 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[matrix.length - i - 1][matrix.length - 1 - j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("270 degree clockwise rotation.\n");

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[j][matrix.length - 1 - i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Exit.");
                    break;
                }
                default: {
                    System.out.println("Invalid number. Please try again.");
                    repeat = false;
                    break;
                }
            }
        } while (!repeat);
        return matrix;
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


