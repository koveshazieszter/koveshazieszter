package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int lineCount = scanner.nextInt();
        String s =" ";
        for (int i = 0 ; i<lineCount;i++){
            s = s +"*";
            System.out.println(s);
        }
    }
}
