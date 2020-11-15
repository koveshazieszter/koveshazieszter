package com.company;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int lineCount = scanner.nextInt();
        //String s = "*";
        int spaceCount = lineCount - 1;
        int starCount = 1;
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount--;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");

            }
            starCount += 2;
            System.out.println(" ");
        }

        spaceCount++;
        starCount-=2;
        for (int i = 0; i < lineCount-1; i++) {
            spaceCount++;
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            starCount -= 2;
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}






