package com.company;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int square = scanner.nextInt();
        int spaceCount;
        spaceCount = square;
        for (int i = 0; i < square; i++) {
            System.out.print("%");
        }
        System.out.println(" ");
        for (int i = 0; i < square - 2; i++) {
            for (int j = 0; j < spaceCount; j++) {
                if (j == 0 || j == (square - 1) || i==j-1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < square; i++) {
            System.out.print("%");
        }
    }
}
