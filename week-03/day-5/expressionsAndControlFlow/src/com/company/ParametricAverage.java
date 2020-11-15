package com.company;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates the sum and the average of the numbers you enter!");
        System.out.println("How many numbers do you want to enter?");
        int number = scanner.nextInt();
        int sum =0;
        int numbers=0;
        for (int i = 0; i < number; i++) {
            System.out.println("Please, enter a number!");
            numbers = scanner.nextInt();
            sum += numbers;
        }
        int numberAverage = sum /numbers;
        System.out.println("Amount: " + sum + " Average: " + sum / numbers );
    }

}
