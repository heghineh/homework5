package com.company;

import java.util.Scanner;

public class problem5_9 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        double radius = getRadiusFromConsole();
        double area = calculateCircleArea(radius);
        double perimeter = calculateCirclePerimeter(radius);
        System.out.println("Area is " + area + " and perimeter is " + perimeter);
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double calculateCirclePerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public static double getRadiusFromConsole() {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();
        return radius;
    }
}