package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please,enter the first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Please,enter the second number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Please,enter the third number!");
        int thirdNumber = scanner.nextInt();
        System.out.println("Please,enter the fourth number!");
        int fourthNumber = scanner.nextInt();
        System.out.println("Please,enter the  fifth number!");
        int fifthNumber = scanner.nextInt();
        int sumOfNumbers = fifthNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        int averageOfNumbers = sumOfNumbers / 5;
        System.out.println("Sum: " + sumOfNumbers + "  Average: " + averageOfNumbers);


    }
}

