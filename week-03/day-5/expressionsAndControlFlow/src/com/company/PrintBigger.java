package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter the first number!");
        int numberFirst = scanner.nextInt();
        System.out.println("Please,enter the second number!");
        int numberSecond = scanner.nextInt();

        if (numberFirst > numberSecond) {
            System.out.println(numberFirst);
        } else {
            System.out.println(numberSecond);
        }

    }

}


