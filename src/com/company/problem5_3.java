//get 2 numbers from console
//        write a function to calculate their product
//        write a function to calculate cube of the product
//        print the cube of the product

package com.company;

import java.util.Scanner;

public class problem5_3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your numbers: ");

        double product = calculateTheProduct(getNumbersFromConsole());
        double productCube = calculateCubeOfProduct(product);

        System.out.println("Product is " + product);
        System.out.println("Cube of Product is " + productCube);
    }

    public static double calculateTheProduct(double[] array) {
        return (array[0] * array[1]);
    }

    public static double calculateCubeOfProduct(double number) {
        double cube = Math.pow(number, 3);
        return cube;
    }

    public static double[] getNumbersFromConsole() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double[] array = {number1, number2};
        return array;
    }
}