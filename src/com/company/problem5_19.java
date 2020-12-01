//Write a function (takes a number N as input from console) creates N x N matrix
//        And initializes it with random numbers in range 27 - 78
//        Write a function to rotate that matrix 90*
//        Write a function to rotate that matrix 180*
//        Write a function to rotate that matrix 270
package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem5_19 {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int[][] matrix = initializeMatrix(inputNumberFromConsole());
        System.out.println("Here is your matrix");
        printMatrix(matrix);
        System.out.println("\nRotated 90*");
        rotateTo90(matrix);
        System.out.println("\nRotated 180*");
        rotateTo180(matrix);
        System.out.println("\nRotated 270*");
        rotateTo270(matrix);
    }

    public static int inputNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
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