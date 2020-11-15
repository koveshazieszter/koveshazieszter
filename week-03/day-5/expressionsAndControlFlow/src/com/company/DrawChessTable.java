package com.company;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int columns = 8;
        int rows = 8;
        String oddRow = "";
        for (int i = 0; i < columns; i++) {
            oddRow += i % 2 == 0 ? "%" : " ";
        }
        String evenRow = "";
        for (int i = 0; i < columns; i++) {
            evenRow += i % 2 == 0 ? " " : "%";
        }
        for (int i = 0; i < rows/2; i++) {
            System.out.println(oddRow);
            System.out.println(evenRow);
        }



        /*
        for(int i = 0; i < rows; i++) {
            if(i%2==0){
                System.out.print(" ");
            }
            for (int j = 0; j < columns-1; j++) {
                System.out.print("%"+" ");
            }
            if(i%2==0 && j%2==0){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        */
    }
}
