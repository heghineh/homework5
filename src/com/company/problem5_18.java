//Write a function (takes a number n as input from console) to displays
//an n-by-n matrix. Initialized randomly by ‘+’ or ‘-’

package com.company;

import java.util.Random;
import java.util.Scanner;

public class problem5_18 {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        String[][] matrix = initializeMatrix(inputNumberFromConsole());
        System.out.println("Here is your matrix");
        printMatrix(matrix);
    }

    public static int inputNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String[][] initializeMatrix(int number) {
        int[][] matrix = new int[number][number];
        Random random = new Random();
        String[][] myMatrix = new String[number][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
                myMatrix[i][j] = String.valueOf(matrix[i][j]);
                if (matrix[i][j] == 0) {
                    myMatrix[i][j] = "-";
                } else {
                    myMatrix[i][j] = "+";
                }
            }
        }
        return myMatrix;
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}