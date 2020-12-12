//get sides of the triangle
//        write a function to check if the triangle with those sides is a valid triangle
//        write a function to calculate the perimeter of the triangle
//        write a function to calculate the area of the triangle
//        in case the triangle is valid
//        - calculate perimeter
//        - calculate area
//        print both

package com.company;

import java.util.Scanner;

public class problem5_10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter three numbers: ");
        int[] sides = getNumbersFromConsole();
        if (checkTriangleExistence(sides)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is invalid.");
        }
    }

    public static boolean checkTriangleExistence(int[] array) {
        return array[0] + array[1] > array[2] &&
                array[0] + array[2] > array[1] &&
                array[1] + array[2] > array[0];
    }

    public static int calculateTrianglePerimeter(int[] array) {
        int perimeter = array[0] + array[1] + array[2];
        return perimeter;
    }

    public static int[] getNumbersFromConsole() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int[] array = {number1, number2, number3};
        return array;
    }
}