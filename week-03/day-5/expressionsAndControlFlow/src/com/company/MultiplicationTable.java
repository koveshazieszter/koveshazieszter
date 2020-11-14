package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please, enter a number!");
        int number = scanner.nextInt();
        for(int i = 0; i < 10;i++){
            int result = number * (i+1);
            System.out.println((i+1) + " * " + number + " = " + result);
        }

    }
}
