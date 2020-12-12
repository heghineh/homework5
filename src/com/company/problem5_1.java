//generate 2 random numbers
//        write a function to calculate their sum
//        print the sum

package com.company;

public class problem5_1 {

    public static void main(String[] args) {
        int sum = calculateTheSum(5, 4);
        System.out.println("Sum is " + sum);
    }

    public static int calculateTheSum(int number1, int number2) {
        return (number1 + number2);
    }
}