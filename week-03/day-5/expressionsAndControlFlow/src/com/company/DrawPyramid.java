package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int lineCount = scanner.nextInt();
        String s = "*";
        int spaceCount = lineCount - 1;
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount--;
            System.out.println(s);
            s += "**";
        }
    }
}


