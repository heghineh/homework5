package com.company;

import java.util.Scanner;

public class problem5_17 {
    public static void main(String[] args) {
        System.out.println("Enter the number.");
        int factorial = countTheFactorial(inputFromConsole());
        System.out.println(factorial);
    }

    public static int countTheFactorial(int number){
        int factorial = 1;
        for(int i = 1 ; i <= number; i++){
            factorial *= i;
        }
        if(number == 0){
            factorial = 1;
        }
        return factorial;
    }

    public static int inputFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
